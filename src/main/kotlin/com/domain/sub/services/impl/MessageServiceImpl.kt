package com.domain.sub.services.impl

import com.domain.sub.models.Message
import com.domain.sub.services.MessageService
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageServiceImpl(val db: JdbcTemplate) : MessageService {
    override fun findMessages(): List<Message> = db.query("SELECT * FROM messages") { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }

    override fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID().toString()
        db.update(
            "INSERT INTO messages values ( ?, ? );",
            message, message.text
        )
    }
}