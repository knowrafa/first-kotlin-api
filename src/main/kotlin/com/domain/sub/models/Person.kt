package com.domain.sub.models

import com.domain.sub.data.vo.v1.PersonVO
import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.UuidGenerator
import org.springframework.data.jpa.domain.AbstractAuditable
import java.util.*


// javax persistence -> jakarta persistence
@Entity
@Table(name = "person")
data class Person(

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String = "",
    @Column(name = "last_name", nullable = false, length = 80)
    var lastName: String = "",
    @Column(nullable = false, length = 100)
    var address: String = "",
    @Column(nullable = false, length = 80)
    var gender: String = "",

    ): Base()