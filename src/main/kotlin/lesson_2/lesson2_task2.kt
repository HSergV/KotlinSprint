package org.example.lesson_2

fun main() {

    val workers = 50
    val trainees = 30
    val salaryWorkers = 30000
    val salaryTrainees = 20000

    val generalSalaryWorkers = workers * salaryWorkers
    val generalExpenses = generalSalaryWorkers + trainees * salaryTrainees
    val averageSalary = generalExpenses / (workers + trainees)

    println(generalSalaryWorkers)
    println(generalExpenses)
    println(averageSalary)

}
