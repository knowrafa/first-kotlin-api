package com.domain.sub.services

import com.domain.sub.models.Message
import org.springframework.stereotype.Service

@Service
interface MessageService {
    fun findMessages(): List<Message>

    fun save(message: Message)
}