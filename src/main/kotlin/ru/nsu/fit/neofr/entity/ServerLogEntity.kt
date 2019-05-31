package ru.nsu.fit.neofr.entity

import javax.persistence.*
import java.sql.Date

@Entity
@Table(name = "ServerLog", schema = "habit", catalog = "HabitCounter")
class ServerLogEntity (
    @Id
    @Column(name = "log_record_id")
    var logRecordId: Int = 0,

    @Basic
    @Column(name = "month_start")
    var monthStart: Date,

    @Basic
    @Column(name = "counter")
    var counter: Int
)
