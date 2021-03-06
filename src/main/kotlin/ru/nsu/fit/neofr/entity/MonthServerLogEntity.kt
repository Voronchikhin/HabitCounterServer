package ru.nsu.fit.neofr.entity

import javax.persistence.*
import java.sql.Date

@Entity
@Table(name = "MonthServerLog", schema = "habit", catalog = "HabitCounter")
class MonthServerLogEntity(
        @Id
        @GeneratedValue
        @Column(name = "log_record_id")
        var logRecordId: Int = 0,
        @Basic
        @Column(name = "actionDate")
        var actionDate: Date
)