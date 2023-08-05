package com.domain.sub.services

import com.domain.sub.models.Message
import org.springframework.stereotype.Service
import org.springframework.jdbc.core.JdbcTemplate
import java.util.*

@Service
class MessageService(val db: JdbcTemplate) {
    fun findMessages(): List<Message> = db.query("SELECT * FROM messages".toString()) { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }

    fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID().toString()
        db.update(
            "insert into messages values ( ?, ? );",
            message, message.text
        )
    }
}