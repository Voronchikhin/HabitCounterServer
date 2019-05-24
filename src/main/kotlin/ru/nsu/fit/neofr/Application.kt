package ru.nsu.fit.neofr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import ru.nsu.fit.neofr.controller.LoginController


@SpringBootApplication
@ComponentScan(basePackageClasses = [LoginController::class])
class Application : SpringBootServletInitializer() {

//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            SpringApplication.run(Application::class.java, *args)
//
//        }
//    }
}