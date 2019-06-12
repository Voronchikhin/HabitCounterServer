package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "AppUser", schema = "habit", catalog = "HabitCounter")
class AppUserEntity(
        @Id
        @GeneratedValue
        @Column(name = "user_id", nullable = false)
        var userId: Long = 0,
        @Basic
        @Column(name = "user_name", nullable = false)
        var userName: String
)
