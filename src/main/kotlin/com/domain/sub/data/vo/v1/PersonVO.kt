package com.domain.sub.data.vo.v1

import java.util.*

// javax persistence -> jakarta persistence

data class PersonVO(

    var id: UUID? = null,

    var firstName: String = "",

    var lastName: String = "",

    var address: String = "",

    var gender: String = "",

    )