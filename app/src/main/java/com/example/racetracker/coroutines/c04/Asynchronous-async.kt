package com.example.racetracker.coroutines.c04

import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            val forecast: Deferred<String> = async {
                getForecast()
            }
            val temperature: Deferred<String> = async {
                getTemperature()
            }
            println("${forecast.await()} ${temperature.await()}")
            println("Have a good day!")
        }
    }
    println("\nExecution time: ${time / 1000.0} seconds")
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}