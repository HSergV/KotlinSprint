package org.example

fun main(){

    val reservationToday = 13
    val reservationTomorrow = 9

    val availableToday = NUMBER_OF_TABLES > reservationToday
    val availableTomorrow = NUMBER_OF_TABLES > reservationTomorrow

    println("[Доступность столиков на сегодня: $availableToday]\n" +
            "[Доступность столиков на завтра: $availableTomorrow]")

}

const val NUMBER_OF_TABLES = 13