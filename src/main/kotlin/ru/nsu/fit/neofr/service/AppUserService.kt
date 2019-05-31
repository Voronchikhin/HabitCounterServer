package ru.nsu.fit.neofr.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.nsu.fit.neofr.repositories.AppUserRepository


@Service
class AppUserService {

    @Autowired
    private lateinit var appUserRepository: AppUserRepository


//    fun findAppUser(id : Integer) : AppUserEntity? = appUserDAO.findById(id)
//
//    fun saveAppUser(appUser : AppUserEntity) {
//        appUserDAO.save(appUser)
//    }
//
//    fun deleteAppUser(appUser : AppUserEntity) {
//        appUserDAO.delete(appUser)
//    }
//
//    fun updateAppUser(appUser : AppUserEntity) {
//        appUserDAO.update(appUser)
//    }

    fun findAllAppUsers() = appUserRepository.findAll()



}