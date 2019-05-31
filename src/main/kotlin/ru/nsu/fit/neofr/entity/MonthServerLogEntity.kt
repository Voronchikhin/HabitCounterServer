package ru.nsu.fit.neofr.entity

import javax.persistence.*
import java.sql.Date

@Entity
@Table(name = "MonthServerLog", schema = "dbo", catalog = "HabitCounter")
class MonthServerLogEntity(
        @Id
        @Column(name = "log_record_id")
        var logRecordId: Int = 0,
        @Basic
        @Column(name = "actionDate")
        var actionDate: Date
)