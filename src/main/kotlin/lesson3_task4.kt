package org.example

fun main() {

    var wereFrom = "E2"
    var wereGo = "E4"
    var numberMove = 1

    var numberOfCells: Int
    var wereFromNumber: Int
    var wereGoNumber: Int

    var message = "$wereFrom - $wereGo; $numberMove"

    println(message)

    wereFrom = "D2"
    numberOfCells = 1
    wereFromNumber = wereFrom.substring(1).toInt()
    val wereFromNumberFormat = wereFromNumber.toString()
    wereGoNumber = wereFromNumber + numberOfCells
    val wereGoNumberFormat = wereGoNumber.toString()
    wereGo = wereFrom.replace(wereFromNumberFormat, wereGoNumberFormat)
    numberMove = 2

    message = "$wereFrom - $wereGo; $numberMove"

    println(message)

}
