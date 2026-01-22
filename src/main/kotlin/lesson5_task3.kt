package org.example

fun main() {

    val a = 16
    val b = 35
    val textInput = "Введите первое число от 0 до 42"

    println(textInput)
    val inputNumberOne = readln().toInt()
    println(textInput)
    val inputNumberTwo = readln().toInt()

    var resultNumberOne = false
    var resultNumberTwo = false

    if (inputNumberOne == a || inputNumberOne == b) resultNumberOne = true

    if (inputNumberTwo == a || inputNumberTwo == b) resultNumberTwo = true

    if (inputNumberOne == inputNumberTwo) resultNumberTwo = false

    val textWin = "Поздравляем! Вы выиграли главный приз!"
    val textConsolationPrize = "Вы выиграли утешительный приз!"
    val textLoss = "Неудача!"
    val textNumber = "Выигрышные числа - $a, $b."

    if (resultNumberOne && resultNumberTwo) {
        println(textWin)
    } else if (resultNumberOne || resultNumberTwo) {
        println(textConsolationPrize)
        println(textNumber)
    } else {
        println(textLoss)
        println(textNumber)
    }

}
