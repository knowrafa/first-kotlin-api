package com.domain.sub.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@RequestMapping("/restaurants")
interface RestaurantController {


    @GetMapping
    fun getCount(): Int

}