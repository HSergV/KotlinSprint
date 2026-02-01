package org.example

fun main() {

    println(
        "Расчет стоимости поездки!\n" +
                "Введите растояние поездки:"
    )
    val travelDistance = readln().toDouble()
    println("Введите расход топлива на 100 км:")
    val fuelConsumption = readln().toDouble()
    println("Введите стоимость 1 литра топлива:")
    val fuelPrice = readln().toDouble()

    val requiredFuel = (travelDistance * fuelConsumption) / KILOMETERS
    val totalCoast = requiredFuel * fuelPrice

    println(
        "Необходимое количество топлива - ${"%.2f".format(requiredFuel)}l\n" +
                "Итоговая стоимоть поездки - ${"%.2f".format(totalCoast)}$"
    )

}

const val KILOMETERS = 100
