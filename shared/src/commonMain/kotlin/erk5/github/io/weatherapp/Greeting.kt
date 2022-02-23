package erk5.github.io.weatherapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}