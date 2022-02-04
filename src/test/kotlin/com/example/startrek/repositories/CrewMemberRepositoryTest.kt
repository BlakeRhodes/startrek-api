package com.example.startrek.repositories

import com.example.startrek.models.CrewMember
import com.example.startrek.services.UuidService
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

internal class CrewMemberRepositoryTest {

    @Mock
    lateinit var uuidService: UuidService

    @InjectMocks
    lateinit var repository: CrewMemberRepository

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @AfterEach
    fun tearDown() {
        CrewMemberRepository.collection.removeAll{ true }
    }

    @Test
    fun `add should add the character the collection`() {
        val id = "47"
        val unsaved = CrewMember(null, "Blake Rhodes", "Commander", "Sciences")
        val expected = CrewMember(id, "Blake Rhodes", "Commander", "Sciences")

        `when`(uuidService.next()).thenReturn(id)

        repository.add(unsaved)

        assertEquals(expected, CrewMemberRepository.collection[0])
    }

    @Test
    fun `add should return the new id of the CrewMember`() {
        val id = "47"
        val unsaved = CrewMember(null, "Blake Rhodes", "Commander", "Sciences")
        val expected = CrewMember(id, "Blake Rhodes", "Commander", "Sciences")

        `when`(uuidService.next()).thenReturn(id)

        val result = repository.add(unsaved)

        assertEquals(expected, result)
    }
}