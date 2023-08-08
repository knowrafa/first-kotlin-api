package com.domain.sub.services.impl

import com.domain.sub.exceptions.ResourceNotFoundException
import com.domain.sub.models.Person
import com.domain.sub.repository.PersonRepository
import com.domain.sub.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

// Basically, all of @Component (Service, Respository and more) can be used in lateinit or as class constructor
@Service
class PersonServiceImpl : PersonService {

    @Autowired
    private lateinit var repository: PersonRepository

    private val counter: AtomicLong = AtomicLong()

    //Podia ser, esse é apenas o nome que aparece na info de logLogger.getLogger("Frango assado")
    private val logger = Logger.getLogger(PersonServiceImpl::class.java.name)

    override fun findAll(): List<Person> {
        logger.info("Finding all of the people!")
        return repository.findAll()
    }

    override fun findById(id: Long): Person {
        /**
         * Uses findById (defaults from repository) function and throws an error in case result is null
         */
        logger.info("Finding one person with id $id")
        return repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this id") }
    }


    override fun create(person: Person): Person {
        logger.info("Creating one person named ${person.firstName + person.lastName}")
        return repository.save(person)
    }

    override fun update(person: Person): Person {
        logger.info("Updating one person with ${person.id}")
        val entity = repository.findById(person.id)
            .orElseThrow { ResourceNotFoundException("No records found for this id") }

        entity.firstName = person.firstName
        entity.lastName = person.lastName

        return repository.save(entity)
    }

    override fun delete(id: Long) {
        val entity = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this id") }
        repository.delete(entity)
    }

}