package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount = 70000
    val percent = 16.7
    val paymentsPerYear = 1.0
    val years = 20.0

    val percentOneYear = (paymentsPerYear + percent / ALL_PERCENT)
    val percentAllPeriod = percentOneYear.pow(years)
    val depositAmount = initialAmount * percentAllPeriod

    println("%.3f".format(depositAmount))

}

const val ALL_PERCENT = 100.0
