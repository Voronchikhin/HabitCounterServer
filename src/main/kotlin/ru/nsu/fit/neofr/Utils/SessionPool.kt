package ru.nsu.fit.neofr.Utils

import java.util.*

object SessionPool {
    val sessions = mutableMapOf<String, UUID>()
}