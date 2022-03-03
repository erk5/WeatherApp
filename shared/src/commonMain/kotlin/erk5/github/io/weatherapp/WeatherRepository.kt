package erk5.github.io.weatherapp

import erk5.github.io.weatherapp.NetworkResolver.client
import erk5.github.io.weatherapp.entity.WeatherEntity
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.native.concurrent.SharedImmutable

@SharedImmutable
internal expect val ApplicationDispatcher: CoroutineDispatcher

class WeatherRepository {

    fun getWeather(callback: (WeatherEntity) -> Unit) {
        GlobalScope.launch(ApplicationDispatcher) {
            kotlin.runCatching {
                WeatherApi().fetchWeather()
            }.fold(
                onSuccess = {
                    println("### $it")
                    callback(it)
                },
                onFailure = {
                    println("### $it")
                    throw it
                }
            ).also {
                client.close()
            }
        }
    }
}