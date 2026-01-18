package org.example.lesson_2

fun main(){

    val timeDeparturesHour = 9
    val timeDeparturesMinute = 39
    val generalTimeInMinute = 457
    val minuteInHour = 60

    val timeOnTheWayHour = generalTimeInMinute / minuteInHour
    val timeOnTheWayMinute = generalTimeInMinute % minuteInHour

    var timeArrivalHour = timeDeparturesHour + timeOnTheWayHour + (timeDeparturesMinute + timeOnTheWayMinute) / 60
    var timeArrivalMinute = (timeDeparturesMinute + timeOnTheWayMinute) % 60

    println("${timeArrivalHour}:${timeArrivalMinute}")

}
