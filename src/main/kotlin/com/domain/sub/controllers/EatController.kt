package com.domain.sub.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
interface EatController {
    @GetMapping("/flavor/{foodType}")
    fun getFlavor(
        @PathVariable(value = "foodType") foodType: Int,
    )
}