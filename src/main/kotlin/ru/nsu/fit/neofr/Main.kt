package ru.nsu.fit.neofr

import ru.nsu.fit.neofr.Service.AppUserService


object Main {


    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")

//
        var appUserService = AppUserService()
        for (user in appUserService.findAllAppUsers()) {
            print(user.userId)
            println("-----"+user.userName)
        }
    }
}