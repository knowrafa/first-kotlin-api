package com.domain.sub.repository

import com.domain.sub.models.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

// Coloca a classe que será gerenciada e o tipo da chave primária!
@Repository
interface PersonRepository: JpaRepository<Person, Long?> {
}