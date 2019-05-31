package ru.nsu.fit.neofr.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class HabitResourceId (
        @Column (name = "habit_id")
        var habitId : Int,
        @Column (name = "resource_id")
        var resourceId: Int
) : Serializable {
    override fun equals(other: Any?): Boolean = other is HabitResourceId
    && other.habitId == habitId && other.resourceId == resourceId

    override fun hashCode(): Int = 31 * habitId.hashCode() + resourceId.hashCode()
}