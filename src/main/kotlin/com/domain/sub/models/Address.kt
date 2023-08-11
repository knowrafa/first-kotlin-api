package com.domain.sub.models

import org.springframework.data.mongodb.core.mapping.Field

data class Address(
    val building: String = "",
    val street: String = "",
    val zipcode: String = "",
    @Field("coord")
    val coordinate: List<Double> = emptyList()
)