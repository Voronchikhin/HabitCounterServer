package ru.nsu.fit.neofr.entity

import javax.persistence.*
import java.sql.Date

@Entity
@Table(name = "ServerLog", schema = "dbo", catalog = "HabitCounter")
class ServerLogEntity {
    @get:Id
    @get:Column(name = "log_record_id")
    var logRecordId: Int = 0
    @get:Basic
    @get:Column(name = "month_start")
    var monthStart: Date? = null
    @get:Basic
    @get:Column(name = "counter")
    var counter: Int? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as ServerLogEntity?

        if (logRecordId != that!!.logRecordId) return false
        if (if (monthStart != null) monthStart != that.monthStart else that.monthStart != null) return false
        return if (if (counter != null) counter != that.counter else that.counter != null) false else true

    }

    override fun hashCode(): Int {
        var result = logRecordId
        result = 31 * result + if (monthStart != null) monthStart!!.hashCode() else 0
        result = 31 * result + if (counter != null) counter!!.hashCode() else 0
        return result
    }
}
