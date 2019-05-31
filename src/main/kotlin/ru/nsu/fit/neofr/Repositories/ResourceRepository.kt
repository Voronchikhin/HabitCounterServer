package ru.nsu.fit.neofr.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.nsu.fit.neofr.model.ResourceEntity


@Repository
interface ResourceRepository : CrudRepository<ResourceEntity, Int> {

}