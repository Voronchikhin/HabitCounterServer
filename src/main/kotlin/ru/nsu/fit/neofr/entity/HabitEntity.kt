package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "Habit", schema = "dbo", catalog = "HabitCounter")
class HabitEntity {
    @get:Id
    @get:Column(name = "habit_id")
    var habitId: Int = 0
    @get:Basic
    @get:Column(name = "habit_name")
    var habitName: String? = null
    @get:Basic
    @get:Column(name = "habit_description")
    var habitDescription: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as HabitEntity?

        if (habitId != that!!.habitId) return false
        if (if (habitName != null) habitName != that.habitName else that.habitName != null) return false
        return if (if (habitDescription != null) habitDescription != that.habitDescription else that.habitDescription != null) false else true

    }

    override fun hashCode(): Int {
        var result = habitId
        result = 31 * result + if (habitName != null) habitName!!.hashCode() else 0
        result = 31 * result + if (habitDescription != null) habitDescription!!.hashCode() else 0
        return result
    }
}
