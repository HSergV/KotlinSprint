package org.example

fun main(){

    var damage = readln().toBoolean()
    var numberCrew = readln().toInt()
    var numberBoxes = readln().toInt()
    var goodWeather = readln().toBoolean()

    val possibilitySailing = ((damage == DAMAGE)
            &&(numberCrew in NUMBER_OF_CREW_MIN..NUMBER_OF_CREW_MAX)
            &&(numberBoxes > NUMBER_OF_BOXES)
            &&(goodWeather == GOOD_WEATHER)) ||
                    ((damage != DAMAGE)
                    &&(numberCrew > NUMBER_OF_CREW_MAX)
                    &&(numberBoxes > NUMBER_OF_BOXES)
                    &&(goodWeather == GOOD_WEATHER))

    println(possibilitySailing)

}

const val DAMAGE = false
const val NUMBER_OF_CREW_MIN = 55
const val NUMBER_OF_CREW_MAX = 70
const val NUMBER_OF_BOXES = 50
const val GOOD_WEATHER = true