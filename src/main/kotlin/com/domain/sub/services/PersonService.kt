package com.domain.sub.services

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.data.vo.v2.PersonVO as PersonVOV2


interface PersonService {

    fun findById(id: Long): PersonVO

    fun findAll(): List<PersonVO>

    fun create(person: PersonVO): PersonVO

    fun createV2(person: PersonVOV2): PersonVOV2
    fun update(id: Long, person: PersonVO): PersonVO

    fun delete(id: Long): Unit

}