package Colecoes.funcoes

val numbers = listOf(1, -5, -8 , -8, 5, 65)
val anyNegative = numbers.any{it < 0}
val anyGT6 = numbers.any{it > 6}

fun main() {
    println(numbers)
    println(anyGT6)
    println(anyNegative)
}