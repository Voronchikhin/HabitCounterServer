package ru.nsu.fit.neofr.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.nsu.fit.neofr.entity.AppUserEntity
import ru.nsu.fit.neofr.repositories.AppUserRepository


@Service
class AppUserService {

    @Autowired
    private lateinit var appUserRepository: AppUserRepository

    fun findAllAppUsers() = appUserRepository.findAll()

    fun createNewUser(name: String): AppUserEntity {
        val user = AppUserEntity(0, name)

        return appUserRepository.save(user)
    }

    fun findByName(name: String): AppUserEntity {
        return appUserRepository.findByName(name)
    }
}