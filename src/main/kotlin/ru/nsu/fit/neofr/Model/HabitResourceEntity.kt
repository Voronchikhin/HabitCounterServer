package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "Habit_Resource", schema = "dbo", catalog = "HabitCounter")
class HabitResourceEntity(
        @Basic
        @Column(name = "resource_per_time", nullable = false)
        var resourcePerTime: Double,

        @ManyToOne
        @JoinColumn(name = "habit_id", nullable = false)
        var habitEntity: HabitEntity,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "resource_id", referencedColumnName = "resource_id")
        var resourceEntity: ResourceEntity

)
