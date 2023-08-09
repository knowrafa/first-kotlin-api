package com.domain.sub.data.vo.v1

// javax persistence -> jakarta persistence

data class PersonVO(

    var id: Long = 0,

    var firstName: String = "",

    var lastName: String = "",

    var address: String = "",

    var gender: String = "",

    )