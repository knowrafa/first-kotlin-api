package com.domain.sub.controllers.impl

import com.domain.sub.controllers.EatController
import com.domain.sub.services.impl.EatHamburgerServiceImpl
import com.domain.sub.services.impl.EatPaoDeQueijoServiceImpl
import com.domain.sub.services.impl.EatPorkAndBeanServiceImpl
import com.domain.sub.services.impl.EatStrogonoffServiceImpl


class EatControllerImpl : EatController {

    override fun getFlavor(foodType: Int) {
        TODO("Not yet implemented")
    }

    //The return type is -> EatService<*> (unsafe way )
    // But Kotlin understands the inference
    private fun getFoodService(foodType: Int) = when (foodType) {
        1 -> EatPorkAndBeanServiceImpl()
        2 -> EatHamburgerServiceImpl()
        3 -> EatPaoDeQueijoServiceImpl()
        4 -> EatStrogonoffServiceImpl()
        else -> throw RuntimeException("No food service was found! Try again with existing food services.")
    }
}