package com.example.startrek.services

import org.springframework.stereotype.Service
import java.util.*

@Service
class UuidService {
    fun next():String {
        return UUID.randomUUID().toString()
    }
}