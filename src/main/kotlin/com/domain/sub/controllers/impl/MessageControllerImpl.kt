package com.domain.sub.controllers.impl

import com.domain.sub.controllers.MessageController
import com.domain.sub.models.Message
import com.domain.sub.services.MessageService


class MessageControllerImpl(val service: MessageService): MessageController {

    override fun index(): List<Message> {
        return service.findMessages()
    }

    override fun post( message: Message) {
        service.save(message)
    }
}