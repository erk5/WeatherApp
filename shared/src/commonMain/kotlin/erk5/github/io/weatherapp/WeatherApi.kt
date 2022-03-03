package erk5.github.io.weatherapp

import erk5.github.io.weatherapp.NetworkResolver.client
import erk5.github.io.weatherapp.entity.WeatherEntity
import io.ktor.client.request.*

/**
 * Created by eriko on 2022/02/23.
 */
class WeatherApi {
    suspend fun fetchWeather(): WeatherEntity {
        return client.get {
            url("${BASE_URL}/data/2.5/weather?q=London,uk&appid=${API_KEY}")
        }
    }

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org"
        private const val API_KEY = ""  // TODO 外部から設定できるようにする
    }
}