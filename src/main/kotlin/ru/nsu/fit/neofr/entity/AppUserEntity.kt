package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "AppUser", schema = "dbo", catalog = "HabitCounter")
class AppUserEntity (
        @Id
        @Column(name = "user_id", nullable = false)
        var userId : Long,
        @Basic
        @Column(name = "user_name", nullable = false)
        var userName: String
)
