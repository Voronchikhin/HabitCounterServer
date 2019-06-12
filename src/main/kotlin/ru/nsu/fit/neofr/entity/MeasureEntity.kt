package ru.nsu.fit.neofr.entity

import javax.persistence.*


@Entity
@Table(name = "Measure", schema = "habit", catalog = "HabitCounter")
class MeasureEntity(
        @Id
        @GeneratedValue
        @Column(name = "measure_id")
        var measureId: Int = 0,
        @Basic
        @Column(name = "measure_name")
        var measureName: String?
)