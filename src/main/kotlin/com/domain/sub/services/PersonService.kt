package com.domain.sub.services

import com.domain.sub.models.Person
import org.springframework.stereotype.Service

@Service
interface PersonService {

    fun findById(id: Long): Person

    fun findAll(): List<Person>

    fun create(person: Person): Person
    fun update(person: Person): Person

    fun delete(id: Long): Unit

}