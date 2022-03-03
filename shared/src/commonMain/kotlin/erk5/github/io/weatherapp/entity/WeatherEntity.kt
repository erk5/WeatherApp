package erk5.github.io.weatherapp.entity

import erk5.github.io.weatherapp.entity.weather.Clouds
import erk5.github.io.weatherapp.entity.weather.Coord
import erk5.github.io.weatherapp.entity.weather.Main
import erk5.github.io.weatherapp.entity.weather.Sys
import erk5.github.io.weatherapp.entity.weather.Weather
import erk5.github.io.weatherapp.entity.weather.Wind
import kotlinx.serialization.Serializable

@Serializable
data class WeatherEntity(
    val base: String?,
    val clouds: Clouds?,
    val cod: Int?,
    val coord: Coord?,
    val dt: Int?,
    val id: Int?,
    val main: Main?,
    val name: String?,
    val sys: Sys?,
    val timezone: Int?,
    val weather: List<Weather>?,
    val wind: Wind?,
    val visibility: Int?
)