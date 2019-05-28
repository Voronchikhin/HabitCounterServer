package ru.nsu.fit.neofr.entity

import javax.persistence.*

@Entity
@Table(name = "AppUser", schema = "dbo", catalog = "HabitCounter")
class AppUserEntity {
    @get:Id
    @get:Column(name = "user_id")
    var userId: Int = 0
    @get:Basic
    @get:Column(name = "user_name")
    var userName: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as AppUserEntity?

        if (userId != that!!.userId) return false
        return if (if (userName != null) userName != that.userName else that.userName != null) false else true

    }

    override fun hashCode(): Int {
        var result = userId
        result = 31 * result + if (userName != null) userName!!.hashCode() else 0
        return result
    }
}
