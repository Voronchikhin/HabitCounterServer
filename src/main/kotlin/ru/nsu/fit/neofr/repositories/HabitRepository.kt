package ru.nsu.fit.neofr.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.nsu.fit.neofr.Model.AppUserEntity
import ru.nsu.fit.neofr.Model.HabitEntity

@Repository
interface HabitRepository : CrudRepository<HabitEntity, Int> {
    fun findByHabitName (user : AppUserEntity?) : List<HabitEntity>
}