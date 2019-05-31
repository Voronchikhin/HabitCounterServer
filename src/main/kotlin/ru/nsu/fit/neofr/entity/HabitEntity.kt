package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "Habit", schema = "habit", catalog = "HabitCounter")
class HabitEntity(
        @Id
        @Column(name = "habit_id", nullable = false)
        var habitId: Int = 0,
        @Basic
        @Column(name = "habit_name", nullable = false)
        var habitName: String,
        @Basic
        @Column(name = "habit_description", nullable = false)
        var habitDescription: String? = null,

        @OneToMany(mappedBy = "habitEntity", targetEntity = HabitResourceEntity::class)
        var resources: List<HabitResourceEntity>
)
