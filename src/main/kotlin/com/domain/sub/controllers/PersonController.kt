package com.domain.sub.controllers

import com.domain.sub.data.vo.v1.PersonVO
import com.domain.sub.data.vo.v2.PersonVO as PersonVOV2
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/person")
interface PersonController {

    //Produces by default deals with application/json type
    @RequestMapping(
        method = [RequestMethod.GET],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun findAll(): List<PersonVO>

    @GetMapping(
        value = ["/{id}"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun findById(
        @PathVariable(value = "id") id: Long,
    ): PersonVO

    @PostMapping(
        value = ["/v1"],
        // method = [RequestMethod.GET], <- Only if using RequestMapping. {Method}Mapping (PostMapping...) is an Annotation that uses RequestMapping
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun create(
        @RequestBody person: PersonVO,
    ): PersonVO

    @PostMapping(
        value = ["/v2"],
        // method = [RequestMethod.GET], <- Only if using RequestMapping. {Method}Mapping (PostMapping...) is an Annotation that uses RequestMapping
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun createV2(
        @RequestBody person: PersonVOV2,
    ): PersonVOV2

    @PatchMapping(
        value = ["/{id}"],
        // method = [RequestMethod.GET], <- Only if using RequestMapping. PostMapping is an Annotation that uses RequestMapping
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun update(
        @PathVariable(value = "id") id: Long,
        @RequestBody person: PersonVO,
    ): PersonVO

    @DeleteMapping(
        value = ["/{id}"],
        produces = [MediaType.APPLICATION_JSON_VALUE],
        )
    fun delete(
        @PathVariable(value = "id") id: Long,
    ): ResponseEntity<*>


}