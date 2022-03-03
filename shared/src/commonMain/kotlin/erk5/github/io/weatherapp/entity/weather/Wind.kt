package erk5.github.io.weatherapp.entity.weather

import kotlinx.serialization.Serializable

@Serializable
data class Wind(
    val deg: Double?,
    val speed: Double?
)