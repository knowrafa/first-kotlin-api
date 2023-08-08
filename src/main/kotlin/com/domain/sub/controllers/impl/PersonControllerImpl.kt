package com.domain.sub.controllers.impl

import com.domain.sub.controllers.PersonController
import com.domain.sub.models.Person
import com.domain.sub.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonControllerImpl : PersonController {
    // O Bean é o objeto que a classe representa no RUNTIME. SINGLETON.
    // Repository (JPA) é uma interface, DIFERENTE.

    @Autowired
    private lateinit var service: PersonService
    // Mesma coisa de colocar no Construtor da classe service: PersonService


    override fun findAll(): List<Person> {
        return service.findAll()
    }

    override fun findById(
        id: Long,
    ): Person {
        return service.findById(id)
    }

    override fun create(person: Person): Person {
        return service.create(person)
    }

    override fun update(id: Long): Person {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long): Person {
        TODO("Not yet implemented")
    }


}