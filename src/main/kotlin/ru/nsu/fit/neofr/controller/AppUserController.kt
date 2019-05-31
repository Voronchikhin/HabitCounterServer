package ru.nsu.fit.neofr.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.neofr.Service.AppUserService

@RestController
@RequestMapping("user")
class AppUserController {
    @Autowired
    private lateinit var appUserService : AppUserService

}