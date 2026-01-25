package org.example

fun main() {

    var a: Int = 6

    val table = """
        $a x 1 = ${a * 1}
        $a x 2 = ${a * 2}
        $a x 3 = ${a * 3}
        $a x 4 = ${a * 4}
        $a x 5 = ${a * 5}
        $a x 6 = ${a * 6}
        $a x 7 = ${a * 7}
        $a x 8 = ${a * 8}
        $a x 9 = ${a * 9}
        $a x 10 = ${a * 10}
    """.trimIndent()

    println(table)

}
