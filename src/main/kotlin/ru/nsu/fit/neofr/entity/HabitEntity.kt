package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "Habit", schema = "dbo", catalog = "HabitCounter")
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

        @OneToMany(mappedBy = "habitEntity")
        @JoinColumn(name = "habit_id", insertable = true)
        var resources: List<HabitResourceEntity>
)
