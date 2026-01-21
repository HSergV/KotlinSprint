package org.example.lesson_2

fun main() {

    val timeDeparturesHour = 9
    val timeDeparturesMinute = 39
    val generalTimeInMinute = 457


    val timeOnTheWayHour = generalTimeInMinute / MINUTE_IN_HOUR
    val timeOnTheWayMinute = generalTimeInMinute % MINUTE_IN_HOUR

    val timeArrivalHour = timeDeparturesHour + timeOnTheWayHour + (timeDeparturesMinute + timeOnTheWayMinute) / MINUTE_IN_HOUR
    val timeArrivalMinute = (timeDeparturesMinute + timeOnTheWayMinute) % MINUTE_IN_HOUR

    println(String.format("%02d:%02d", timeArrivalHour, timeArrivalMinute))

}

const val MINUTE_IN_HOUR = 60

