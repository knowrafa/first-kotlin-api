package com.domain.sub.services

import com.domain.sub.models.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()

    //Podia ser, esse é apenas o nome que aparece na info de logLogger.getLogger("Frango assado")
    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person!")

        return Person(
            counter.incrementAndGet(),
            "Rafael",
            "Tome",
            "Goiânia - Goiás",
            "Male"
        )
        // person.id = counter.incrementAndGet()
        // person.firstName = "Rafael"
        // person.lastName = "Tome"
        // person.address = "Goiânia - Goiás"
        //person.gender = "Male"
    }

    fun findAll(): List<Person> {
        val persons: MutableList<Person> = mutableListOf()
        logger.info("Finding all people!")
        for (i in 1..5) {
            persons.add(
                Person(
                    counter.incrementAndGet(),
                    "Rafael",
                    "Tome",
                    "Goiânia - Goiás",
                    "Male"
                )
            )
        }

        return persons
    }

    fun create(person: Person) = person
    fun update(person: Person) = person

    fun delete(id: Long) {}

}