package com.domain.sub.models

import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

data class Grade(
    val date: Date = Date(),
    @Field("grade")
    val rating: String = "",
    val score: Int = 0
)