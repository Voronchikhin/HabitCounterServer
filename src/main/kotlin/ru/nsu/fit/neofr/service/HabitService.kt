package ru.nsu.fit.neofr.Service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import ru.nsu.fit.neofr.Exceptions.NotFoundInTableException
import ru.nsu.fit.neofr.Model.HabitEntity
import ru.nsu.fit.neofr.repositories.HabitRepository


@Service
class HabitService {
    @Autowired
    private lateinit var habitRepository: HabitRepository


    fun getHabitById(id : Int): HabitEntity {
        val habit = habitRepository.findByIdOrNull(id)
        if (habit is HabitEntity)
            return habit
        throw NotFoundInTableException(id, "Habit")
    }



    fun findAllHabits() = habitRepository.findAll()

    fun findById(id : Int) = habitRepository.findById(id)
}