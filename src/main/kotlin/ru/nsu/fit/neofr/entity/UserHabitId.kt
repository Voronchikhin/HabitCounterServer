package ru.nsu.fit.neofr.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class UserHabitId (
    @Column(name  = "user_id")
    var userId : Int,
    @Column(name  = "habit_id")
    var habitId : Int
) : Serializable {
    override fun equals(other: Any?): Boolean = other is UserHabitId
    && other.userId == userId && other.habitId == habitId

    override fun hashCode() = 31 * userId.hashCode() + habitId.hashCode()
}