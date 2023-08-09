package com.domain.sub.data.vo.v2

import java.util.*

// javax persistence -> jakarta persistence

data class PersonVO(
    /*
    Virtual object class for mappings in v2 version
     */

    var id: Long = 0,

    var firstName: String = "",

    var lastName: String = "",

    var birthDay: Date? = null,

    var address: String = "",

    var gender: String = "",

    )