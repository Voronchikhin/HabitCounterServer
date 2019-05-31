package ru.nsu.fit.neofr.entity

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "User_Habit", schema = "dbo", catalog = "HabitCounter")
class UserHabitEntity (
    @EmbeddedId
    var id : UserHabitId
)
