package com.domain.sub.services.impl

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.exceptions.ResourceNotFoundException
import com.domain.sub.mapper.DozerMapper
import com.domain.sub.models.Person

import com.domain.sub.repository.PersonRepository
import com.domain.sub.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

// Basically, all of @Component (Service, Respository and more) can be used in lateinit or as class constructor
@Service
class PersonServiceImpl(val repository: PersonRepository) : PersonService {

    //@Autowired
    //private lateinit var repository: PersonRepository

    private val counter: AtomicLong = AtomicLong()

    //Could be the same name as "chicken", is just the log identifier
    private val logger = Logger.getLogger(PersonServiceImpl::class.java.name)

    override fun findAll(): List<PersonVO> {
        logger.info("Finding all of the people!")
        val persons = repository.findAll()
        // Assim o Dozer consegue converter a listagem em VO's
        return DozerMapper.parseListObjects(persons, PersonVO::class.java)
    }

    override fun findById(id: Long): PersonVO {
        /**
         * Uses findById (defaults from repository)
         * function and throws an error in case result is null
         */
        logger.info("Finding one person with id $id")
        var person = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this id") }

        return DozerMapper.parseObject(person, PersonVO::class.java)
    }


    override fun create(person: PersonVO): PersonVO {
        logger.info("Creating one person named ${person.firstName + person.lastName}")
        val entity: Person = DozerMapper.parseObject(person, Person::class.java)
        return DozerMapper.parseObject(repository.save(entity), PersonVO::class.java)
    }

    override fun update(id: Long, person: PersonVO): PersonVO {
        logger.info("Updating one person with ${person.id}")
        val entity = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this id") }

        entity.firstName = person.firstName
        entity.lastName = person.lastName

        return DozerMapper.parseObject(repository.save(entity), PersonVO::class.java)
    }

    override fun delete(id: Long) {
        val entity = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this id") }
        repository.delete(entity)
    }

}