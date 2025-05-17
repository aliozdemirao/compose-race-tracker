package com.example.racetracker.coroutines.c10

import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("runBlocking function: ${Thread.currentThread().name}")
            launch {
                println("launch function: ${Thread.currentThread().name}")
                withContext(Dispatchers.Default) {
                    println("withContext function: ${Thread.currentThread().name}")
                    delay(1000)
                    println("10 results found.")
                }
                println("end of launch function: ${Thread.currentThread().name}")
            }
            println("Loading...")
        }
    }
    println("\nExecution time: ${time / 1000.0} seconds")
}