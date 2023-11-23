package When

fun obterDiaDaSemana(numero: Int): String{
    return when (numero){
        1 -> "Domingo"
        2 -> "Seunda"
        3 -> "Terca"
        4 -> "Quarta"
        5 -> "Quinta"
        6 -> "Sexta"
        7 -> "Sábado"
        else -> "Número inválido"
    }
}

fun classificarIdade(idade: Int): String{
    return when {
        idade in 0..12 -> "Criança"
        idade in 13 .. 17 -> "Adolescente"
        idade in 18 .. 58 -> "Adulto"
        idade >= 60 -> "Idoso"
        else -> "Idade inválida"
    }
}

fun verificarParOuImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        numero % 2 == 1 -> "Impár"
        else -> "Número invalido"
    }
}

fun traduzirNota(nota: Int): String {

    return when{
        nota in 100 downTo 90 -> "A"
        nota in 90 downTo 80 -> "B"
        nota in 80 downTo 70 -> "C"
        else -> "Número errado ou fora do escopo"

    }
}



fun main() {
    println(obterDiaDaSemana(4))
    println(classificarIdade(26))
    println(verificarParOuImpar(4))
    println(verificarParOuImpar(45))
    println(verificarParOuImpar(3))
    println(traduzirNota(98))
    println(traduzirNota(59))
    print(traduzirNota(48))
}