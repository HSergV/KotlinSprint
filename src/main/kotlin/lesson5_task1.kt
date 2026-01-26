package org.example

fun main() {

    val a = (1..10).random()
    val b = (1..10).random()
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
