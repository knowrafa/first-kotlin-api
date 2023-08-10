package com.domain.sub.services

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.models.Person
import org.springframework.stereotype.Service
import java.util.*


interface PersonService {

    fun findById(id: UUID): PersonVO

    fun findAll(): List<PersonVO>

    fun create(person: PersonVO): PersonVO
    fun update(id: UUID, person: PersonVO): PersonVO

    fun delete(id: UUID): Unit

}