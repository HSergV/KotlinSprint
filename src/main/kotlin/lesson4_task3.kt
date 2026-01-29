package org.example

const val HUMIDITY = 20
const val OUT_OF_SEASON = "winter"

fun main() {

    val isWeatherSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "winter"

    val suitableConditions = isWeatherSunny
            && isAwningOpen
            && (humidity == HUMIDITY)
            && (season != OUT_OF_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableConditions")

}
