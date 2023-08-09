package com.domain.sub.services

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.models.Person
import org.springframework.stereotype.Service


interface PersonService {

    fun findById(id: Long): PersonVO

    fun findAll(): List<PersonVO>

    fun create(person: PersonVO): PersonVO
    fun update(id: Long, person: PersonVO): PersonVO

    fun delete(id: Long): Unit

}