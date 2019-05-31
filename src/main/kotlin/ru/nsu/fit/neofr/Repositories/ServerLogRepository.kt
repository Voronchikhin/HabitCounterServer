package ru.nsu.fit.neofr.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.nsu.fit.neofr.model.ServerLogEntity

@Repository
interface ServerLogRepository : CrudRepository<ServerLogEntity, Int> {
}