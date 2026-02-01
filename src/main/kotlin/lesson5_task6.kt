package org.example

import kotlin.math.pow

fun main() {

    val textGreeting = "Расчет индекса массы тела (ИМТ)"
    val textWeight = "Введите свой вес"
    val textHeight = "Введите свой рост"
    val textInsufficientMass = "Недостаточная масса тела"
    val textNormalMass = "Нормальная масса тела"
    val textOwerWeight = "Избыточная масса тела"
    val textObesity = "Ожирение"

    println("$textGreeting\n$textWeight")
    val weight = readln().toDouble()
    println(textHeight)
    val height = readln().toDouble()
    val formatHeight = height / FORMAT_METER
    val bodyMassIndex = weight / formatHeight.pow(SQUARE)

    if (bodyMassIndex < MIN_IMB) {
        println("${"%.2f".format(bodyMassIndex)} кг/м2 - $textInsufficientMass")
    } else if (bodyMassIndex in MIN_IMB..<NORMAL_IMB) {
        println("${"%.2f".format(bodyMassIndex)} кг/м2 - $textNormalMass")
    } else if (bodyMassIndex in NORMAL_IMB..<MAX_IMB) {
        println("${"%.2f".format(bodyMassIndex)} кг/м2 - $textOwerWeight")
    } else {
        println("${"%.2f".format(bodyMassIndex)} кг/м2 - $textObesity")
    }

}

const val FORMAT_METER = 100
const val SQUARE = 2
const val MIN_IMB = 18.5
const val NORMAL_IMB = 25.0
const val MAX_IMB = 30.0
