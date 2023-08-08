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

    @RequestMapping(value = ["/sub/{numberOne}/{numberTwo}"])
    fun sub(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Operation

    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Operation

    @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Operation

    @RequestMapping(value = ["/average/{numberOne}/{numberTwo}"])
    fun average(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Operation

    @RequestMapping(value = ["/division/{number}"])
    fun squareRoot(
        @PathVariable(value = "number") number: String?,
    ): Operation

}