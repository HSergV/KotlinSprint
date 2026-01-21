package org.example.lesson_1

fun main(){
    val secondsGeneral = 6480
    val secondsInMinute = 60
    val minuteInHour = 60

    val hour = secondsGeneral / (minuteInHour * secondsInMinute)
    val minute = (secondsGeneral % (minuteInHour * secondsInMinute)) / minuteInHour
    val seconds = secondsGeneral % secondsInMinute

    print("%02d".format(hour))
    print(":")
    print("%02d".format(minute))
    print(":")
    print("%02d".format(seconds))

}