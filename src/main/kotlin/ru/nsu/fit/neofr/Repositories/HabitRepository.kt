package ru.nsu.fit.neofr.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.nsu.fit.neofr.model.AppUserEntity
import ru.nsu.fit.neofr.model.HabitEntity

@Repository
interface HabitRepository : CrudRepository<HabitEntity, Int> {
    fun findAllByUser(user : AppUserEntity?) : List<HabitEntity>
}