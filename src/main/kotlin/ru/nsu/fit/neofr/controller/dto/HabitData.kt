package ru.nsu.fit.neofr.controller.dto

import ru.nsu.fit.neofr.entity.HabitEntity

class HabitData (
        var id : Int,
        var name : String,
        var description : String
) {
    constructor(habitEntity: HabitEntity) : this(
            habitEntity.habitId,
            habitEntity.habitName.toString(),
            habitEntity.habitDescription.toString()
    )
}