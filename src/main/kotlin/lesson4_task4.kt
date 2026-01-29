package org.example

fun main() {

    val day = 6
    val isEven = true


    val isOddDay = day % REMAINDER_OF_DIVISION == 0

    val isPraxis = isEven == isOddDay


    println("""
        Упражнение для рук: ${!isPraxis}
        Упражнение для ног: $isPraxis
        Упражнение для спины: $isPraxis
        Упражнение для пресса: ${!isPraxis}
    """.trimIndent())

}

const val REMAINDER_OF_DIVISION = 2
