package ru.nsu.fit.neofr.Model

import javax.persistence.*

@Entity
@Table(name = "Resource", schema = "dbo", catalog = "HabitCounter")
class ResourceEntity {
    @get:Id
    @get:Column(name = "resource_id")
    var resourceId: Int = 0
    @get:Basic
    @get:Column(name = "resource_name")
    var resourceName: String? = null
    @get:Basic
    @get:Column(name = "resource_description")
    var resourceDescription: String? = null
    @get:Basic
    @get:Column(name = "total_count")
    var totalCount: Double? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as ResourceEntity?

        if (resourceId != that!!.resourceId) return false
        if (if (resourceName != null) resourceName != that.resourceName else that.resourceName != null) return false
        if (if (resourceDescription != null) resourceDescription != that.resourceDescription else that.resourceDescription != null)
            return false
        return if (if (totalCount != null) totalCount != that.totalCount else that.totalCount != null) false else true

    }

    override fun hashCode(): Int {
        var result = resourceId
        result = 31 * result + if (resourceName != null) resourceName!!.hashCode() else 0
        result = 31 * result + if (resourceDescription != null) resourceDescription!!.hashCode() else 0
        result = 31 * result + if (totalCount != null) totalCount!!.hashCode() else 0
        return result
    }
}
