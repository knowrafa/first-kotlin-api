package com.domain.sub.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("restaurants") // This declares that this data class represents a document in Atlas.
data class Restaurant(
    @Id
    val id: ObjectId = ObjectId(),
    val address: Address = Address(),
    val borough: String = "",
    val cuisine: String = "",
    val grades: List<Grade> = emptyList(),
    val name: String = "",
    @Field("restaurant_id")
    val restaurantId: String = ""
)