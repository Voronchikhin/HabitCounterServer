package ru.nsu.fit.neofr.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.neofr.service.HabitService
import ru.nsu.fit.neofr.entity.HabitEntity

@RestController
@RequestMapping("habits")
class HabitController {
    @Autowired
    private lateinit var habitService: HabitService

    @GetMapping("all")
    fun getHabits() : List<HabitEntity> {
        return habitService.findAllHabits().toList()
    }

    @GetMapping("concrete")
    fun getHabits(
            @RequestParam habitId : Int
    ) : ByteArray {
        return habitService.getHabitById(habitId).habitName.toByteArray()
    }
}
