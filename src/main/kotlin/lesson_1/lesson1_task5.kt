package org.example.lesson_1

fun main(){
    val secondsGeneral = 6480

    val hour = secondsGeneral / (MINUTE_IN_HOUR * SECOND_IN_MINUTE)
    val minute = (secondsGeneral % (MINUTE_IN_HOUR * SECOND_IN_MINUTE)) / MINUTE_IN_HOUR
    val seconds = secondsGeneral % SECOND_IN_MINUTE

    print("%02d".format(hour))
    print(":")
    print("%02d".format(minute))
    print(":")
    print("%02d".format(seconds))

}

const val SECOND_IN_MINUTE = 60
const val MINUTE_IN_HOUR = 60
