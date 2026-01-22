package org.example

import kotlin.random.Random

fun main() {

    val a = Random.nextInt(1, 10)
    val b = Random.nextInt(1, 10)
    val x = a + b

    println(
        "Добрый день! докажите что вы не робот\n" +
                "запишите в консоль правильный ответ\n" +
                "$a + $b = "
    )

    val inputNumber = readln().toInt()

    if (x == inputNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }

}
