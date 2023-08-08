package com.domain.sub.controllers

import com.domain.sub.models.Person
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
interface PersonController {
    @RequestMapping(
        method = [RequestMethod.GET],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun findAll(): List<Person>

    @RequestMapping(
        value = ["/{id}"],
        method = [RequestMethod.GET],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun findById(
        @PathVariable(value = "id") id: Long,
    ): Person

    @PostMapping(
        value = ["/{id}"],
        // method = [RequestMethod.GET], <- Only if using RequestMapping. {Method}Mapping (PostMapping...) is an Annotation that uses RequestMapping
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun createPerson(
        @PathVariable(value = "id") id: Long,
    ): Person

    @PatchMapping(
        value = ["/{id}"],
        // method = [RequestMethod.GET], <- Only if using RequestMapping. PostMapping is an Annotation that uses RequestMapping
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun updatePerson(
        @PathVariable(value = "id") id: Long,
    ): Person

    @DeleteMapping(
        value = ["/{id}"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun deletePerson(
        @PathVariable(value = "id") id: Long,
    ): Person


}