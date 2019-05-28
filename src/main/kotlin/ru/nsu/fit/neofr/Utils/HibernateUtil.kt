package ru.nsu.fit.neofr.Utils

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder
import ru.nsu.fit.neofr.entity.*


class HibernateUtil private constructor() {

    companion object {
        private var sessionFactory: SessionFactory? = null

//        init { sessionFactory = null}

//    private fun HibernateUtil(): ??? {}


        fun getSessionFactory(): SessionFactory {
            if (sessionFactory == null) {
                try {
                    val configuration = Configuration().configure()
                    configuration.addAnnotatedClass(AppUserEntity::class.java)
                    configuration.addAnnotatedClass(HabitEntity::class.java)
                    configuration.addAnnotatedClass(UserHabitEntity::class.java)
                    configuration.addAnnotatedClass(MeasureEntity::class.java)
                    configuration.addAnnotatedClass(ResourceEntity::class.java)
                    configuration.addAnnotatedClass(HabitResourceEntity::class.java)
                    configuration.addAnnotatedClass(ServerLogEntity::class.java)
                    configuration.addAnnotatedClass(MonthServerLogEntity::class.java)
                    val builder = StandardServiceRegistryBuilder().applySettings(configuration.properties)
                    sessionFactory = configuration.buildSessionFactory(builder.build())

                } catch (e: Exception) {
                    println("exeption lol from hibernateUtil")
                }
            }
            return this.sessionFactory!!
        }
    }
}