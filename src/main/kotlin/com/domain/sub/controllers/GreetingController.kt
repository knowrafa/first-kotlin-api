package com.domain.sub.controllers

import com.domain.sub.models.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

interface GreetingController{

    @RequestMapping("/greeting")
    fun greeting(
            @RequestParam(value = "firstName", required = true) firstName: String?,
            @RequestParam(value = "lastName", defaultValue = "second-name" ) lastName: String?,
    ): Greeting
}