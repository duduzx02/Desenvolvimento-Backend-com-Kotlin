// Verificação de um número par

val numero = 187

val mensagem = if (numero % 2 == 0){
    "O número é par."
} else {
    "O número é ímpar."
}

// Atribuição com base em uma condição

val temperatura = 25

val status = if(temperatura > 30){
    "Quente"
} else {
    "Agradável"
}

// Expressão condicional como valor de retorno

fun maximo(a: Int, b: Int): Int{
    return if (a > b) a else b
}

val maiorNumero = maximo(15, 8)
val maiorNumero2 = maximo(8, 23)

// Uso de Expressão Condicional em uma Inicialização de Variável

val idade = 164
val statusIdade = if (idade >= 18) "Adulto" else "Menor de idade"

fun main() {
    println(mensagem)
    println(status)
    println("Omaior número é: ${maiorNumero}")
    println("Omaior número é: ${maiorNumero2}")
    println(statusIdade)

}