package com.example.racetracker.coroutines.c01

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            delay(3000)
            println("Sunny")
        }
    }
    println("\nExecution time: ${time / 1000.0} seconds")
}