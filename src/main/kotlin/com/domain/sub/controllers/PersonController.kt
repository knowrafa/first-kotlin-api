package com.domain.sub.controllers

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.models.Person
import com.domain.sub.util.MediaType

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RequestMapping("/person")
interface PersonController {

    //Produces by default deals with application/json type
    @RequestMapping(
        method = [RequestMethod.GET],
        produces = [
            MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML,
            MediaType.APPLICATION_YAML,
        ]
    )
    fun findAll(): List<PersonVO>

    @GetMapping(
        value = ["/{id}"],
        produces = [MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YAML]
        // Needs MediaType.APPLICATION_XML for swagger documentation
    )
    fun findById(
        @PathVariable(value = "id") id: UUID,
    ): PersonVO

    @PostMapping(
        // method = [RequestMethod.GET], <- Only if using RequestMapping. {Method}Mapping (PostMapping...) is an Annotation that uses RequestMapping
        consumes = [MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YAML]
    )
    fun create(
        @RequestBody person: PersonVO,
    ): PersonVO

    @PatchMapping(
        value = ["/{id}"],
        // method = [RequestMethod.GET], <- Only if using RequestMapping. PostMapping is an Annotation that uses RequestMapping
        consumes = [
            MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
            MediaType.APPLICATION_YAML,
        ]
    )
    fun update(
        @PathVariable(value = "id") id: UUID,
        @RequestBody person: PersonVO,
    ): PersonVO

    @DeleteMapping(
        value = ["/{id}"],
        produces = [MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YAML],
    )
    fun delete(
        @PathVariable(value = "id") id: UUID,
    ): ResponseEntity<*>


}