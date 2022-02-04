package com.example.startrek.repositories

import com.example.startrek.models.CrewMember
import com.example.startrek.services.UuidService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class CrewMemberRepository(@Autowired private val uuidService: UuidService) {
    companion object {
        val collection: MutableList<CrewMember> = mutableListOf()
    }

    fun add(value: CrewMember): CrewMember {
        val crewMember = CrewMember(
            uuidService.next(),
            value.name,
            value.rank,
            value.division,
        )

        collection.add(
            crewMember
        )

        return crewMember
    }

    fun getAll(): List<CrewMember> {
        TODO("Implement Me")
    }
}