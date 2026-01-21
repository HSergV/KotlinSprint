package org.example

fun main() {

    val message = "D2-D4;0"
    val parts = message.split("-",";")

    val wereFrom = parts[0]
    val wereGo = parts[1]
    val numberMove = parts[2]

    println(wereFrom)
    println(wereGo)
    println(numberMove)

}
