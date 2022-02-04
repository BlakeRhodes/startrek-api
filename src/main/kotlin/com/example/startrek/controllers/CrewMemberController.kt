package com.example.startrek.controllers

import com.example.startrek.models.CrewMember
import com.example.startrek.repositories.CrewMemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("crew-members")
class CrewMemberController(@Autowired private val repository: CrewMemberRepository ) {
    @GetMapping
    fun get(): List<CrewMember> {
        return repository.getAll()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: String): List<CrewMember>{
        TODO("Implement This")
    }


    @PostMapping
    fun post(@RequestBody crew: CrewMember): CrewMember {
        return repository.add(crew)
    }

    @PutMapping("/{id}")
    fun put(@PathVariable id: String, @RequestBody updated: CrewMember): CrewMember {
        TODO("Implement This")
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        TODO("Implement This")
    }
}