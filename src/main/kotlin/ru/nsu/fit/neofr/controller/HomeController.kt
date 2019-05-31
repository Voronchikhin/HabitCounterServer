package ru.nsu.fit.neofr.controller

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Level.SEVERE
import java.sql.SQLException
import java.sql.ResultSet
import java.sql.DriverManager
import java.util.logging.Logger

@Component
@RestController
@RequestMapping("")
class HomeController {
    init {
        println("------------------------------------------------------")
        println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        println("111111111111111111111111111111111111111111111111111111")
        println("HALO FROM HOME CONTROLLER")
        println("111111111111111111111111111111111111111111111111111111")
        println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    }

    @GetMapping("welcome")
    fun login() = "welcome home page! hello!".toByteArray()

//    @GetMapping()
}
