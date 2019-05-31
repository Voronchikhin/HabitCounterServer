package ru.nsu.fit.neofr.Service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import ru.nsu.fit.neofr.Exceptions.NotFoundInTableException
import ru.nsu.fit.neofr.model.HabitEntity
import ru.nsu.fit.neofr.repositories.AppUserRepository
import ru.nsu.fit.neofr.repositories.HabitRepository


@Service
class HabitService {
    @Autowired
    private lateinit var habitRepository: HabitRepository
    @Autowired
    private lateinit var appUserRepository: AppUserRepository

//    private val defaultHabit = HabitEntity()

    fun getHabitById(id : Int): HabitEntity {
        val habit = habitRepository.findByIdOrNull(id)
        if (habit is HabitEntity)
            return habit
        throw NotFoundInTableException(id, "Habit")
    }

    fun getHabitByUser(userId :  Int) : List<HabitEntity> {
        val user = appUserRepository.findByIdOrNull(userId)
        return habitRepository.findAllByUser(user)
    }

    fun findAllHabits() = habitRepository.findAll()
}