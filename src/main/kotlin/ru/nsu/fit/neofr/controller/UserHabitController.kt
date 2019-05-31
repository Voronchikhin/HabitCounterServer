package ru.nsu.fit.neofr.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.neofr.service.AppUserService
import ru.nsu.fit.neofr.service.HabitService

@RestController
@RequestMapping("user_habit")
class UserHabitController {
    @Autowired
    private lateinit var habitService: HabitService
    @Autowired
    private lateinit var appUserService : AppUserService

    //    @GetMapping()
//    fun getHabits(
//        @RequestParam userId : Int
//    ) : List<HabitEntity> {
//        println("------------FROM FIRST GEThABITS----------------")
//        return habitService.getHabitByUser(userId)
//    }
}