package com.domain.sub.repository

import com.domain.sub.models.Restaurant
import org.springframework.data.mongodb.repository.MongoRepository

import org.springframework.stereotype.Repository

@Repository
interface RestaurantRepository: MongoRepository<Restaurant, String> {
    fun findByRestaurantId(id: String): Restaurant?
}