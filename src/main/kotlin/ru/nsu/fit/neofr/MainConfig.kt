package ru.nsu.fit.neofr

import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.apache.tomcat.jni.SSL.setPassword
import java.net.URI
import javax.sql.DataSource


@Configuration
@ComponentScan
class MainConfig {
    @Bean
    fun dataSource() : DataSource {
        val dbUri = URI(System.getenv("DATABASE_URL"))

        val username = dbUri.getUserInfo().split(":")[0]
        val password = dbUri.getUserInfo().split(":")[1]
        val dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath()

        val basicDataSource = HikariDataSource()
        basicDataSource.jdbcUrl = dbUrl
        basicDataSource.username = username
        basicDataSource.password = password

        return basicDataSource
    }
}