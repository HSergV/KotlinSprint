package org.example

fun main() {

    var a: Int

    val b1 = 1
    val b2 = 2
    val b3 = 3
    val b4 = 4
    val b5 = 5
    val b6 = 6
    val b7 = 7
    val b8 = 8
    val b9 = 9
    val b10 = 10

    a = 6

    val table = """
        $a x $b1 = ${a*b1}
        $a x $b2 = ${a*b2}
        $a x $b3 = ${a*b3}
        $a x $b4 = ${a*b4}
        $a x $b5 = ${a*b5}
        $a x $b6 = ${a*b6}
        $a x $b7 = ${a*b7}
        $a x $b8 = ${a*b8}
        $a x $b9 = ${a*b9}
        $a x $b10 = ${a*b10}
    """.trimIndent()

    println(table)

}
