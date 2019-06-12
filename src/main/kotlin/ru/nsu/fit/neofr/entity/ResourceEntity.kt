package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "Resource", schema = "habit", catalog = "HabitCounter")
class ResourceEntity(
        @Id
        @Column(name = "resource_id")
        @GeneratedValue
        var resourceId: Int = 0,
        @Basic
        @Column(name = "resource_name")
        var resourceName: String,
        @Basic
        @Column(name = "resource_description")
        var resourceDescription: String? = null,
        @Basic
        @Column(name = "total_count")
        var totalCount: Double
)