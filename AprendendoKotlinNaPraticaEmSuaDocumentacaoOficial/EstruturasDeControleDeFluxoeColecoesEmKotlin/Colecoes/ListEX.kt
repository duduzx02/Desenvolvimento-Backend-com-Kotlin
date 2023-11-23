package Colecoes

import java.text.DecimalFormat

//Crie uma lista imutável de strings contendo nomes de cores: "Red", "Green", "Blue", "Yellow", "Purple".
val coresImutaveis: List<String> = listOf("Red", "Grenn", "Blue", "Yellow", "Purple")

// Crie uma lista mutável de números inteiros contendo os primeiros 5 números pares.
val pareImutaveis = mutableListOf(2, 4, 6, 8, 10)

// Crie uma lista mutável de notas (números decimais). Calcule e imprima a média das notas.
val notas = mutableListOf(6.0, 5.0, 5.0)

// Crie uma lista mutável de números inteiros. Em seguida, remova todos os números ímpares da lista.
val numeros = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
fun main() {

    val media: Double = notas.average()
    println("A média das notas é: ${media}")

    numeros.removeAll{it % 2 != 0}

    println(numeros)

}
