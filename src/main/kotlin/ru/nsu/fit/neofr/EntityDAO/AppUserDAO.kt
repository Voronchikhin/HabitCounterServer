package ru.nsu.fit.neofr.EntityDAO

import ru.nsu.fit.neofr.Utils.HibernateUtil
import ru.nsu.fit.neofr.entity.AppUserEntity

class AppUserDAO {

    fun findById(id : Integer) : AppUserEntity? {
        return HibernateUtil.getSessionFactory().openSession()
                .get(AppUserEntity::class.java, id)
    }

    fun save(user: AppUserEntity) {
        val session = HibernateUtil.getSessionFactory().openSession()
        val tx1 = session.beginTransaction()
        session.save(user)
        tx1.commit()
        session.close()
    }

    fun update(user: AppUserEntity) {
        val session = HibernateUtil.getSessionFactory().openSession()
        val tx1 = session.beginTransaction()
        session.update(user)
        tx1.commit()
        session.close()
    }

    fun delete(user: AppUserEntity) {
        val session = HibernateUtil.getSessionFactory().openSession()
        val tx1 = session.beginTransaction()
        session.delete(user)
        tx1.commit()
        session.close()
    }

    fun findAll(): List<AppUserEntity> {
        return HibernateUtil.getSessionFactory().openSession()
                .createQuery("From User").list() as List<AppUserEntity>
    }
}
