package ru.nsu.fit.neofr.repositories

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import ru.nsu.fit.neofr.entity.AppUserEntity

@Repository
interface AppUserRepository : CrudRepository<AppUserEntity, Int>{
    @Query("from AppUserEntity where userName=:name")
    fun  findByName(@Param("name")name: String) : AppUserEntity
}