package com.example.startrek.models

data class CrewMember(
    val id: String?,
    val name: String,
    val rank: String,
    val division: String,
    // TODO: Add home world, probably need builder pattern
    // TODO: Add species
)
