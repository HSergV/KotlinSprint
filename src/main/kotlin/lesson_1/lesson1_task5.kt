package org.example.lesson_1

fun main(){
    val secondsGeneral = 6480

    val hour = secondsGeneral / 3600
    val minute = (secondsGeneral % 3600) / 60
    val seconds = secondsGeneral % 60

    var formatHour = ""
    var formatMinute = ""
    var formatSeconds = ""

    if (hour <= 9){
       formatHour = "0${hour}"
    } else {
        formatHour = hour.toString()
    }

    if (minute <= 9){
        formatMinute = "0${minute}"
    } else {
        formatMinute = minute.toString()
    }

    if (seconds <= 9){
        formatSeconds = "0${seconds}"
    } else {
        formatSeconds = seconds.toString()
    }

    println("${formatHour}:${formatMinute}:${formatSeconds}")

}