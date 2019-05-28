package ru.nsu.fit.neofr.entity

import javax.persistence.*
import java.sql.Date

@Entity
@Table(name = "MonthServerLog", schema = "dbo", catalog = "HabitCounter")
class MonthServerLogEntity {
    @get:Id
    @get:Column(name = "log_record_id")
    var logRecordId: Int = 0
    @get:Basic
    @get:Column(name = "actionDate")
    var actionDate: Date? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as MonthServerLogEntity?

        if (logRecordId != that!!.logRecordId) return false
        return if (if (actionDate != null) actionDate != that.actionDate else that.actionDate != null) false else true

    }

    override fun hashCode(): Int {
        var result = logRecordId
        result = 31 * result + if (actionDate != null) actionDate!!.hashCode() else 0
        return result
    }
}
