package FuncaoDeEscopo


val resultado = run {
    val saudacao = "ola"
    val nome = "Mundo"

    "$saudacao, $nome!"
}

fun getNullableLength(ns: String?){
    println("for \"$ns\":")
    ns?.run{
        println("\tis empty? " + isEmpty())
        println("\tlenght = $length")
        length
    }
}

fun main() {
    println(resultado)

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("som string with Kotlin")
}