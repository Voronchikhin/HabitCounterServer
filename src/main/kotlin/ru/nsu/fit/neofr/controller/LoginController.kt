package ru.nsu.fit.neofr.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class LoginController {
    init {
        println("hello from controller")
    }

    @GetMapping("/login")
    fun login() = "hello".toByteArray()
}
