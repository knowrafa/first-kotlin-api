package com.domain.sub.controllers.impl

import com.domain.sub.controllers.EatController
import com.domain.sub.controllers.OperationController
import com.domain.sub.models.Operation
import com.domain.sub.services.EatHamburgerServiceImpl
import com.domain.sub.services.impl.EatPaoDeQueijoServiceImpl
import com.domain.sub.services.impl.EatPorkAndBeanServiceImpl
import com.domain.sub.services.impl.EatStrogonoffServiceImpl
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException

@RestController
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