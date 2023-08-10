package com.domain.sub.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.hibernate.annotations.UuidGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.io.Serializable
import java.util.*


@MappedSuperclass
open class Base (
    @Id
    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,

    // @CreatedDate <-- Spring Data JPA
    @CreationTimestamp // <-- Hibernate
    var createdAt: Date? = null,

    // @LastModifiedDate <-- Spring Data JPA
    @UpdateTimestamp // <-- Hibernate
    var updatedAt: Date? = null

): Serializable
