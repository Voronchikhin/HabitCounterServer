package ru.nsu.fit.neofr.entity

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "Habit_Resource", schema = "dbo", catalog = "HabitCounter")
class HabitResourceEntity {
    @get:Basic
    @get:Column(name = "resource_per_time")
    var resourcePerTime: Double? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as HabitResourceEntity?

        return if (if (resourcePerTime != null) resourcePerTime != that!!.resourcePerTime else that!!.resourcePerTime != null) false else true

    }

    override fun hashCode(): Int {
        return if (resourcePerTime != null) resourcePerTime!!.hashCode() else 0
    }
}
