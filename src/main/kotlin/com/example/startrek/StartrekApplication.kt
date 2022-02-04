package com.example.startrek

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StartrekApplication

fun main(args: Array<String>) {
	runApplication<StartrekApplication>(*args)
}
