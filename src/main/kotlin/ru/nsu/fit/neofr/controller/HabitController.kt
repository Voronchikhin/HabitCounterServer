package ru.nsu.fit.neofr.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.neofr.Service.HabitService
import ru.nsu.fit.neofr.model.HabitEntity

@RestController
@RequestMapping("habits")
class HabitController /*constructor(
        private val habitService : HabitService) */{
    @Autowired
    private lateinit var habitService: HabitService

    init {
        println("hallo from habit controller!!!!!!!!!!!!!!!!!!!! ")
        println("!!!!!!!!!!!!!!!!!!!!!eeeeeeee!!!!!!!!!!!!!!!!!!!! ")
//        habitService = HabitService()
    }



//    @GetMapping()
//    fun getHabits(
//        @RequestParam userId : Int
//    ) : List<HabitEntity> {
//        println("------------FROM FIRST GEThABITS----------------")
//        return habitService.getHabitByUser(userId)
//    }

//    @GetMapping()
//    fun getHabits() : MutableIterable<HabitEntity> {
//        println("------------FROM second GEThABITS----------------")
//        return habitService.findAllHabits()
//    }

    @GetMapping("/lol")
    fun lol() = "lol".toByteArray()
}
