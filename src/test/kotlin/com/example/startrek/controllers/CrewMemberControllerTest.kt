package com.example.startrek.controllers

import com.example.startrek.models.CrewMember
import com.example.startrek.repositories.CrewMemberRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

internal class CrewMemberControllerTest{

    @Mock
    lateinit var repository: CrewMemberRepository

    @InjectMocks
    lateinit var controller: CrewMemberController

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun `get should return all of the crew members as a list`(){
        //Arrange
        val expected = listOf(
            CrewMember("3", "Blake", "Commander", "Sciences"),
            CrewMember("4", "Hannah", "Assistant", "Sciences")
        )

        `when`(repository.getAll()).thenReturn(expected)

        //Act.
        val result = controller.get()

        //Assert
        assertEquals(expected, result)
    }
}