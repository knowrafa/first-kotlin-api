package com.domain.sub.controllers.impl

import com.domain.sub.controllers.RestaurantController
import com.domain.sub.repository.RestaurantRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestaurantControllerImpl(val repository: RestaurantRepository): RestaurantController {

    override fun getCount(): Int  {
        return repository.findAll().count()
    }
}