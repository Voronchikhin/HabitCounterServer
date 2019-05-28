package ru.nsu.fit.neofr

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import ru.nsu.fit.neofr.controller.HomeController


@SpringBootApplication
@ComponentScan(basePackageClasses = [HomeController::class])
class Application : SpringBootServletInitializer() {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            SpringApplication.run(Application::class.java, *args)

        }


    }
}