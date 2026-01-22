package org.example

import kotlin.system.exitProcess

fun main() {

    println("Hello input your User Name!")
    val inputUserName = readln()

    if (inputUserName != USER_NAME) {
        println("No such name!!!\nPlease register")
        exitProcess(0)
    }

    println("Input your password!")
    val inputPassword = readln()

    if (inputPassword != PASSWORD) {
        println("Password is incorrect try again")
        exitProcess(0)
    } else {
        println("Your details have been verified\n" +
                "User \"Zaphod\", you are allowed to board the \"Heart of Gold\"")
    }

}

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"