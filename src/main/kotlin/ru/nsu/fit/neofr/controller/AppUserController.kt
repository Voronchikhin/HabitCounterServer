package ru.nsu.fit.neofr.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.neofr.controller.dto.Token
import ru.nsu.fit.neofr.service.AppUserService

@RestController
@RequestMapping("user")
class AppUserController {
    @Autowired
    private lateinit var appUserService: AppUserService

    @PostMapping("signup")
    fun signUp(name: String): Token {
        val user = appUserService.createNewUser(name)
        return Token(user.userId)
    }
}