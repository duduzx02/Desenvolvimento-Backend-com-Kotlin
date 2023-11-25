package Colecoes

val arcoIris = mutableSetOf("Vermelhor", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta")

val numeroPrimos = setOf(2, 3, 5, 7)

val arcoPrimos = arcoIris.union(numeroPrimos)

val listaDeNumeros = listOf(1, 2, 3, 2, 4, 5, 3, 6, 7)

fun main() {
    println(arcoIris)
    println(numeroPrimos)
    println(arcoPrimos)

    println(listaDeNumeros)
    val novoSet = listaDeNumeros.toSet()
    println(novoSet)

}