package ru.nsu.fit.neofr.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.nsu.fit.neofr.repositories.AppUserRepository


@Service
class AppUserService {

    @Autowired
    private lateinit var appUserRepository: AppUserRepository

    fun findAllAppUsers() = appUserRepository.findAll()
}