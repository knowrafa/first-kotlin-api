package com.domain.sub.controllers

import com.domain.sub.models.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
interface GreetingController{

    @RequestMapping("/greeting")
    fun greeting(
            @RequestParam(value = "firstName", defaultValue = "first-name", required = true) firstName: String?,
            @RequestParam(value = "lastName", defaultValue = "second-name" ) lastName: String?
    ): Greeting
}