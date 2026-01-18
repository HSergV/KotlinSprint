package org.example.lesson_2

import kotlin.math.pow

fun main(){

    val initialAmount = 70000
    val percent: Double = 16.7
    val paymentsPerYear: Double = 1.0
    val years: Double = 20.0

    val precentOneYear: Double =  (paymentsPerYear + percent / 100.0)
    val precentAllPeriod: Double = precentOneYear.pow(years)
    val depositAmount: Double = initialAmount * precentAllPeriod

    println(String.format("%.3f", depositAmount))

}