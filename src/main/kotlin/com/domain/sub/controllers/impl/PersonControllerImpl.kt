package com.domain.sub.controllers.impl

import com.domain.sub.controllers.PersonController
import com.domain.sub.models.Operation
import com.domain.sub.models.Person
import com.domain.sub.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException

@RestController
class PersonControllerImpl : PersonController {

    @Autowired
    private lateinit var service: PersonService
    // Mesma coisa de colocar no Construtor da classe service: PersonService
    // var service: PersonService = PersonService(

    override fun findAll(): List<Person> {
        return service.findAll()
    }

    override fun findById(
        id: Long,
    ): Person {
        return service.findById(id)
    }

    override fun createPerson(id: Long): Person {
        TODO("Not yet implemented")
    }

    override fun updatePerson(id: Long): Person {
        TODO("Not yet implemented")
    }

    override fun deletePerson(id: Long): Person {
        TODO("Not yet implemented")
    }


}