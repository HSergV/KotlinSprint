package org.example

fun main() {

    var wereFromLetter = "E"
    var wereFromNumber = 2
    var wereGoLetter = "E"
    var wereGoNumber = 4
    var numberMove = 1
    var numberOfCells: Int

    var message = "$wereFromLetter$wereFromNumber - $wereGoLetter$wereGoNumber; $numberMove"

    println(message)

    wereFromLetter = "D"
    wereFromNumber = 2
    wereGoLetter = "D"
    numberOfCells = 1
    wereGoNumber = wereFromNumber + numberOfCells
    numberMove = 2

    message = "$wereFromLetter$wereFromNumber - $wereGoLetter$wereGoNumber; $numberMove"

    println(message)

}
