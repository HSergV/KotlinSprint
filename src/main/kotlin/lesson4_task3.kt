package org.example

fun main() {

    val weather = true
    val awning = true
    val humidity = 20
    val season = "winter"

    val suitableConditions = (weather == SUNNY_WEATHER)
            && (awning == OPEN_AWNING)
            && (humidity == HUMIDITY)
            && (season != OUT_OF_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableConditions")

}

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val HUMIDITY = 20
const val OUT_OF_SEASON = "winter"
