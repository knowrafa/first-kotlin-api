package com.domain.sub.mapper.custom

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.models.Person
import org.springframework.stereotype.Service
import java.util.Date

import com.domain.sub.data.vo.v2.PersonVO as PersonVOV2

@Service
class PersonMapper {
    fun mapEntityToVO(person: Person): PersonVO {
        val vo = PersonVO()
        vo.id = person.id
        //vo.birthDay = person.birthDay
        vo.firstName = person.firstName
        vo.lastName = person.lastName
        return PersonVO()
    }

    fun mapVOToEntity(person: PersonVO): Person {
        return Person(
            id = person.id,
            birthDay = Date(),
            firstName = person.firstName,
            lastName = person.lastName,
        )
    }

}