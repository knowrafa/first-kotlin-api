package com.domain.sub.controllers

import com.domain.sub.models.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping

@RestController
interface MessageController{
    @GetMapping("/messages")
    fun index(): List<Message>

    @PostMapping("/messages")
    fun post(@RequestBody message: Message)
}