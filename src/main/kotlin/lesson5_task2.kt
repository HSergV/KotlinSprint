package org.example

fun main() {

    val currentYear = java.time.Year.now().value

    println("Добрый день! Введите ваш год рождения")

    val inputYear = readln().toInt()
    val userAge = currentYear - inputYear
    val access = "Показать экран со скрытым контентом"
    val notAccess = "Доступ ограничен!"

    if (userAge >= COMING_OF_AGE) println(access)
    else println(notAccess)

}

const val COMING_OF_AGE = 18
