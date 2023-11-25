package Colecoes

// #Declarando e inicializando um Set
// Criando um set mutável
val setMutavel = mutableSetOf("Maçã", "Banana", "Uva")

// Criando um set imutável
val setImutavel = setOf("Laranja", "Pera", "Maçã")

// # Operações básicas em set
fun main() {
    // Adicionando um elemento ao conjunto mutável
    setMutavel.add("Abacaxi")
    println(setMutavel)
    // Removendo um elemento do conjunto mutável
    setMutavel.remove("Banana")
    println(setMutavel)

    // Verificando a presença de elementos
    val contemUva = setMutavel.contains("Uva")
    val contemUvaa = setImutavel.contains("Uva")

    println(contemUva)
    println(contemUvaa)

    //# Operações entre conjuntos
    // União de Conjuntos
    val conjunto1 = setOf(1, 2, 3)
    val conjunto2 = setOf(3, 4, 5)

    val uniao = conjunto1.union(conjunto2)
    // ou
    val uniaoOperador = conjunto1 + conjunto2

    println(uniao)
    println(uniaoOperador)

    // Diferença de conjuntos
    val diferenca = conjunto1.subtract(conjunto2)
    val diferancaOperador = conjunto1 - conjunto2

    println(diferenca)
    println(diferancaOperador)

    // Iterando sobre um set
    for(fruta in setMutavel){
        println(fruta)
    }

}