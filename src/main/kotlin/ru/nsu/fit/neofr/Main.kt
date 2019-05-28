package ru.nsu.fit.neofr

import org.hibernate.HibernateException
import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration
import ru.nsu.fit.neofr.EntityService.AppUserService


object Main {
//    private val ourSessionFactory: SessionFactory
//
//    val session: Session
//        @Throws(HibernateException::class)
//        get() = ourSessionFactory.openSession()
//
//    init {
//        try {
//            val configuration = Configuration()
//            configuration.configure("hibernate.cfg.xml")
//
//            ourSessionFactory = configuration.buildSessionFactory()
//        } catch (ex: Throwable) {
//            throw ExceptionInInitializerError(ex)
//        }
//
//    }

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("HAAAAAAAAALLLLLOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!11")
//        val session = session
//        try {
//            println("querying all the managed entities...")
//            val metamodel = session.sessionFactory.metamodel
//            for (entityType in metamodel.entities) {
//                val entityName = entityType.name
//                val query = session.createQuery("from $entityName")
//                println("executing: " + query.queryString)
//                for (o in query.list()) {
//                    println("  $o")
//                }
//            }
//        } finally {
//            session.close()
//        }

        var appUserService = AppUserService()
        for (user in appUserService.findAllAppUsers()) {
            print(user.userId)
            println("-----"+user.userName)
        }
    }
}