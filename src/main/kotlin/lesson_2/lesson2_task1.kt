package org.example.lesson_2

fun main() {

    val firstStudent = 3
    val secondStudent = 4
    val thirdStudent = 3
    val fourthStudent = 5
    val totalQuantity = 4

    val averageRating = (firstStudent + secondStudent
                         + thirdStudent + fourthStudent) / totalQuantity.toFloat()

    println("%.2f".format(averageRating))

}