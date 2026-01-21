package org.example

fun main() {

    val weightFirstLoad = 20
    val volumeFirstLoad = 80
    val weightSecondLoad = 50
    val volumeSecondLoad = 100

    val average = true

    val loadFirst = (weightFirstLoad > AVERAGE_WEIGHT_MIN)
            && (weightFirstLoad <= AVERAGE_WEIGHT_MAX)
            && (volumeFirstLoad < AVERAGE_VOLUME)
    val loadSecond = (weightSecondLoad > AVERAGE_WEIGHT_MIN)
            && (weightSecondLoad <= AVERAGE_WEIGHT_MAX)
            && (volumeSecondLoad < AVERAGE_VOLUME)

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': " +
            "${average == loadFirst}")

    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
            "${average == loadSecond}")

}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100
