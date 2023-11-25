package Colecoes.funcoes

val number = listOf(1, -2, 8, -8, -7, 8, 6 )
val double = number.map { it * 2 }
val tipled = number.map { it * 3 }

fun main() {
    println(number)
    println(double)
    println(tipled)
}