package org.example

fun main() {

    val day = 5
    val hand = 1
    val leg = 0
    val back = 0
    val press = 1

    val whatDay = day % REMAINDER_OF_DIVISION

    val praxisHand = hand == whatDay
    val praxisLeg = leg == whatDay
    val praxisBack = back == whatDay
    val praxisPress = press == whatDay

    println("""
        Упражнение для рук: $praxisHand
        Упражнение для ног: $praxisLeg
        Упражнение для спины: $praxisBack
        Упражнение для пресса: $praxisPress
    """.trimIndent())

}

const val REMAINDER_OF_DIVISION = 2
