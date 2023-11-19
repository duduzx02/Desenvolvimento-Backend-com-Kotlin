package Introducao

fun printMessage(message: String){        // 1. Uma função simples que usa um parâmetro e retorna uma String.
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {   // 2. Uma função que recebe um segundo
// parâmetro opcional com um valor padrão. O tipo de retorno é omitido, o que significa que é Unit.
    println("[$prefix] $message")
}

fun sum(x: Int, y:Int): Int {   // Uma função que retorna um número inteiro
    return x + y
}

fun multiply(x: Int, y: Int) = x * y    // Uma função de expressão única que retorna um número inteiro. (inferido)

fun main() {
    printMessage("Ola mundo!")
    printMessageWithPrefix("Teste")
    printMessageWithPrefix("Teste1", "teste2")
    printMessageWithPrefix(prefix = "teste3", message = "Teste4")
    println(sum(1, 8))
    println(multiply(6,3))
}