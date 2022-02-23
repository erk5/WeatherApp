package erk5.github.io.weatherapp

import erk5.github.io.weatherapp.NetworkResolver.client

class Greeting {
    suspend fun greeting(): String {
        kotlin.runCatching {
            println("###${WeatherApi().fetchWeather()}")
        }.also {
            client.close()
        }
        return "Hello!"
    }
}