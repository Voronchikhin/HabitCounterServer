package ru.nsu.fit.neofr.EntityService

import ru.nsu.fit.neofr.EntityDAO.AppUserDAO
import ru.nsu.fit.neofr.entity.AppUserEntity

class AppUserService {
    private var appUserDAO = AppUserDAO()


    fun findAppUser(id : Integer) : AppUserEntity? = appUserDAO.findById(id)

    fun saveAppUser(appUser : AppUserEntity) {
        appUserDAO.save(appUser)
    }

    fun deleteAppUser(appUser : AppUserEntity) {
        appUserDAO.delete(appUser)
    }

    fun updateAppUser(appUser : AppUserEntity) {
        appUserDAO.update(appUser)
    }

    fun findAllAppUsers() = appUserDAO.findAll()



}