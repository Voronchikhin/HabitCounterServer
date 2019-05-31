package ru.nsu.fit.neofr.utils

import java.util.*

object SessionPool {
    val sessions = mutableMapOf<String, UUID>()
}