package com.domain.sub.controllers

import com.domain.sub.models.Operation
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException

@RestController
interface OperationController {
    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
            @PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?
    ): Operation

}