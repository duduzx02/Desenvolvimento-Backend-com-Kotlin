package Colecoes

fun main() {
    val number = listOf(1, -5, -8 , -8, 5, 65)

    val positivos = number.filter { it > 0 }
    val negativos = number.filter { it < 0 }

    println(number)
    println(positivos)
    println(negativos)
}