package com.domain.sub.controllers

import com.domain.sub.models.Message
import com.domain.sub.services.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/messages")
    fun index(): List<Message> = service.findMessages()

    @PostMapping("/messages/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
}