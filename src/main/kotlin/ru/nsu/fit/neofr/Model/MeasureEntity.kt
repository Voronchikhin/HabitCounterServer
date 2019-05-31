package ru.nsu.fit.neofr.Model

import javax.persistence.*


@Entity
@Table(name = "Measure", schema = "dbo", catalog = "HabitCounter")
class MeasureEntity {
    @get:Id
    @get:Column(name = "measure_id")
    var measureId: Int = 0
    @get:Basic
    @get:Column(name = "measure_name")
    var measureName: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as MeasureEntity?

        if (measureId != that!!.measureId) return false
        return if (if (measureName != null) measureName != that.measureName else that.measureName != null) false else true

    }

    override fun hashCode(): Int {
        var result = measureId
        result = 31 * result + if (measureName != null) measureName!!.hashCode() else 0
        return result
    }
}
