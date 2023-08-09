package com.domain.sub.controllers.impl

import com.domain.sub.controllers.PersonController
import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.models.Person
import com.domain.sub.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonControllerImpl(val service: PersonService) : PersonController {
    // O Bean é o objeto que a classe representa no RUNTIME. SINGLETON.
    // Repository (JPA) é uma interface, DIFERENTE.

    //@Autowired



    override fun findAll(): List<PersonVO> {
        return service.findAll()
    }

    override fun findById(
        id: Long,
    ): PersonVO {
        return service.findById(id)
    }

    override fun create(person: PersonVO): PersonVO {
        return service.create(person)
    }

    override fun update(id: Long, person: PersonVO): PersonVO {
        return service.update(id, person)
    }

    override fun delete(id: Long): ResponseEntity<*> {
        service.delete(id)
        return ResponseEntity.noContent().build<Any>()
    }


}