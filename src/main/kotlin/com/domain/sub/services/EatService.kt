package com.domain.sub.services

import com.domain.sub.models.Food

interface EatService<T: Food> {
    fun eat(comida: T): String
}