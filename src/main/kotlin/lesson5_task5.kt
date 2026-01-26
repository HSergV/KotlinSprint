package org.example


fun main() {

    val a = (NUMBER_MIN..NUMBER_MAX).random()
    val b = (NUMBER_MIN..NUMBER_MAX).random()
    val c = (NUMBER_MIN..NUMBER_MAX).random()
    val randomList = mutableListOf<Int>()
    randomList.addAll(listOf(a, b, c))
    val textInput = "Введите первое число от 0 до 42"
    val textWin = "Поздравляем вы выиграли джекпот!!!"
    val textTwoAnswer = "Поздравляем! вы угадали два числа, и выиграли крупный приз"
    val textOneAnswer = "Вы угадали одно число. Получите ваш утешительный приз"
    val textLoss = "Вы не угадали ни одного числа."
    val winNumber = "Выигрышные числа - "
    val textNumber = "$a, $b, $c"

    println(textInput)
    val inputNumberOne = readln().toInt()
    println(textInput)
    val inputNumberTwo = readln().toInt()
    println(textInput)
    val inputNumberThree = readln().toInt()
    val inputList = mutableListOf<Int>()
    inputList.addAll(listOf(inputNumberOne, inputNumberTwo, inputNumberThree))

    val resultList = randomList.intersect(inputList.toSet())
    val sizeList = resultList.size

    when (sizeList) {
        1 -> {
            println(textOneAnswer)
            println("$winNumber$textNumber")
        }

        2 -> {
            println(textTwoAnswer)
            println("$winNumber$textNumber")
        }

        3 -> {
            println(textWin)
            println("$winNumber$textNumber")
        }

        else -> {
            println(textLoss)
            println("$winNumber$textNumber")
        }
    }

}

const val NUMBER_MIN = 0
const val NUMBER_MAX = 43
