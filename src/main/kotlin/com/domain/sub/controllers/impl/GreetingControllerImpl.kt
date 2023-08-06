package com.domain.sub.controllers.impl

import com.domain.sub.controllers.GreetingController
import com.domain.sub.models.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


class GreetingControllerImpl : GreetingController {

    val counter: AtomicLong = AtomicLong();


    override fun greeting(
        firstName: String?,
        lastName: String?
    ): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello $firstName $lastName!")
    }
}