package ru.nsu.fit.neofr.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.neofr.ClientModel.HabitData
import ru.nsu.fit.neofr.Service.HabitService
import ru.nsu.fit.neofr.Model.HabitEntity
import java.util.*

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
//        return HabitData(habitService.getHabitById(habitId))
        return habitService.getHabitById(habitId).habitName!!.toByteArray()
    }

    @GetMapping("/lol")
    fun lol() = "lol".toByteArray()
}
