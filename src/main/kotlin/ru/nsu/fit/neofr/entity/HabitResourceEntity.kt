package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "Habit_Resource", schema = "habit", catalog = "HabitCounter")
class HabitResourceEntity(
        @Id
        @Column(name = "habit_resource_id")
        var id : Long,

        @Basic
        @Column(name = "resource_per_time", nullable = false)
        var resourcePerTime: Double,

        @ManyToOne
        @JoinColumn(name = "habit_id", nullable = false)
        var habitEntity: HabitEntity,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "resource_id")
        var resourceEntity: ResourceEntity

)
