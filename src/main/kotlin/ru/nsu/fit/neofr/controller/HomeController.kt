package ru.nsu.fit.neofr.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Level.SEVERE
import java.sql.SQLException
import java.sql.ResultSet
import java.sql.DriverManager
import java.util.logging.Logger


@RestController
@RequestMapping()
class HomeController {
    init {
        println("------------------------------------------------------")
        println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        println("111111111111111111111111111111111111111111111111111111")
        println("HALO FROM HOME CONTROLLER")
        println("111111111111111111111111111111111111111111111111111111")
        println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")

        /*val instanceName = " serverName\\instanseName "
        val databaseName = "Test"
        val userName = "Usr"
        val pass = "**********"
        val connectionUrl = "jdbc:sqlserver://%1\$s;databaseName=%2\$s;user=%3\$s;password=%4\$s;"
        val connectionString = String.format(connectionUrl, instanceName, databaseName, userName, pass)
        try {
            // Подключение к базе данных
            val con = DriverManager.getConnection(connectionString)
            // Отправка запроса на выборку и получение результатов
            val stmt = con.createStatement()
            val executeQuery = stmt.executeQuery("SELECT * FROM [Categories]")
            // Обход результатов выборки
            while (executeQuery.next()) {
                println(executeQuery.getString("Category"))
            }
            // Закрываем соединение
            executeQuery.close()
            stmt.close()
            con.close()
        } catch (ex: SQLException) {
            // Обработка исключений
            Logger.getLogger(DbTest::class.java!!.getName()).log(Level.SEVERE, null, ex)
        }*/

    }

    @GetMapping()
    fun login() = "welcome home page! hello!".toByteArray()
}
