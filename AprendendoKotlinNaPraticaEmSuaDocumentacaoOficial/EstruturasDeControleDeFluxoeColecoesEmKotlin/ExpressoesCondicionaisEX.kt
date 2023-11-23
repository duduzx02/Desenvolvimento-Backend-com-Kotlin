import kotlin.coroutines.coroutineContext

fun main() {
    // Dado um número inteiro, use uma expressão condicional para verificar se é positivo, negativo ou zero.
    val numero: Int = -88

    val statusNumero = if(numero > 0){
        "Positivo"
    } else if (numero < 0){
        "Negativo"
    } else {
        "Zero"
    }

    // Dada a idade de uma pessoa, use uma expressão condicional para classificar se é criança, adolescente, adulto ou idoso.
    val idade: Int = 40

    var statusIdade = if(idade < 13) {
        "Criança"
    } else if(idade <= 18 ) {
        "Adolescente"
    } else if(idade < 60){
        "Adulto"
    } else {
        "Idoso"
    }

    // Dados três números, use uma expressão condicional para encontrar e imprimir o maior deles.
    val num1: Int = 45
    val num2: Int = 45
    val num3: Int = 45

    var statusNumeros = if(num1 > num2 && num1 > num3 ){
        "${num1} é maior"
    } else if(num2 > num1 && num2 > num3){
        "${num2} é maior"
    } else if (num3 > num1 && num3 > num2){
        "${num3} é maior"
    } else {
        "Tudo igual!"
    }

    // Dado um número inteiro, use uma expressão condicional para verificar se é par ou ímpar.
    val numeroParOrImpar: Int = 56

    var statusParOrImpa = if (numeroParOrImpar % 2 == 0){
        "Numero par"
    } else  {
        "Numero Impar"
    }



    println(statusNumero)
    println(statusIdade)
    println(statusNumeros)
    println(statusParOrImpa)

}




