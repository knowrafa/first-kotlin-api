package com.domain.sub.data.vo.v1

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.github.dozermapper.core.Mapping
import org.springframework.hateoas.RepresentationModel
import java.util.*

// javax persistence -> jakarta persistence

@JsonPropertyOrder(
    "id",
    "address",
    "firstName",
    "lastName",
    "gender"
)

data class PersonVO(
    // Dozer library to use one var name and map to another
    @Mapping("id")
    var pk: UUID? = null,
    // To change name returned by the VO class
    @field:JsonProperty("first_name")
    var firstName: String = "",

    @field:JsonProperty("last_name")
    var lastName: String = "",


    var address: String = "",

    // Not show field
    @field:JsonIgnore
    var gender: String = "",

    ): RepresentationModel<PersonVO>()