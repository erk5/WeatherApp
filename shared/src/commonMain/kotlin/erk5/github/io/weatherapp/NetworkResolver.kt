package erk5.github.io.weatherapp

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*

/**
 * Created by eriko on 2022/02/23.
 */
object NetworkResolver {
    val client = HttpClient(CIO) {
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.HEADERS
        }
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }
}