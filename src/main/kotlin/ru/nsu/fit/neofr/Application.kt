package ru.nsu.fit.neofr

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import ru.nsu.fit.neofr.controller.HomeController
import org.springframework.boot.runApplication


//@Configuration
//@EnableJpaRepositories("ru.nsu.fit.neofr.app")
@SpringBootApplication
//@ComponentScan(basePackages = ["ru.nsu.fit.neofr"])
@ComponentScan(basePackageClasses = [HomeController::class])
class Application : SpringBootServletInitializer()  {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
//            SpringApplication.run(Application::class.java, *args)
            runApplication<Application>(*args)
        }
    }
}