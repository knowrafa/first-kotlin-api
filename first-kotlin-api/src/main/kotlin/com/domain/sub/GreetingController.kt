package com.domain.sub

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong();

    @RequestMapping("/greeting")
    fun greeting(
            @RequestParam(value = "firstName", defaultValue = "first-name") firstName: String?,
            @RequestParam(value = "lastName", defaultValue = "second-name") lastName: String?
    ): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello $firstName $lastName!")
    }
}