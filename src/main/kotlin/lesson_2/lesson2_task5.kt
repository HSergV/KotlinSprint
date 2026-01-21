package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount = 70000
    val percent = 16.7
    val paymentsPerYear = 1.0
    val years = 20.0

    val precentOneYear =  (paymentsPerYear + percent / ALL_PRECENT)
    val precentAllPeriod = precentOneYear.pow(years)
    val depositAmount = initialAmount * precentAllPeriod

    println(String.format("%.3f", depositAmount))

}

const val ALL_PRECENT = 100.0
