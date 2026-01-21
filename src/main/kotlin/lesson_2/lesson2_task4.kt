package org.example.lesson_2

fun main() {

    val cristal = 7
    val metal = 11
    val strengtheningPercent = 20

    val bonusCristal = (cristal * strengtheningPercent) / 100
    val bonusMetal = (metal * strengtheningPercent) / 100

    println("cristal : $bonusCristal")
    println("metal : $bonusMetal")

}