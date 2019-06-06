package ru.nsu.fit.neofr.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.nsu.fit.neofr.repositories.AppUserRepository
import ru.nsu.fit.neofr.repositories.HabitRepository

@Service
class UserHabitService {

    @Autowired
    private lateinit var appUserRepository: AppUserRepository

    @Autowired
    private lateinit var habitRepository: HabitRepository
}
