package Colecoes

// Declarando uma Lista imutáavel de Strings (Padrão:
val listaDeNomes: List<String> = listOf("Alice", "Bob", "Charlie")

// Acessando elementos por índice

val primeiroNome = listaDeNomes.getOrNull(0)
val segundoNome = listaDeNomes.getOrNull(1)
val terceiroNome = listaDeNomes.getOrNull(3) //Evita exceção se o índice estiver fora dos limites

fun main() {
    println(primeiroNome)
    println(segundoNome)
    println(terceiroNome)

    // Iterando usando forEach

    listaDeNomes.forEach { nome ->
        println(nome)
    }

    // Iterando usando um loop for
    for(nome in listaDeNomes){
        println(nome)
    }


    val listaMutavel = mutableListOf("Java", "Kotlin")

    listaMutavel.add("C#")
    listaMutavel.addAll(listOf("C", "C++", "Ruby", "Rust"))

    println(listaMutavel)

    for (linguagem in listaMutavel){
        println(linguagem)
    }

    // #Removendo Elementos de uma Lista Mutável
    // Removendo um elemento pelo valor
    listaMutavel.remove("Rust")
    println(listaMutavel)
    // removendo um elemento pelo índice
    listaMutavel.removeAt(1)
    println(listaMutavel)

    // # Verificando a presença de elementos
    // Verificando se a lista contém um elemento
    println("Tem Java na lista? " + listaMutavel.contains("Java"))

    // # Convertendo Lista para Aray e vice-versa:
    val arrayDeNomes = listaDeNomes.toTypedArray()
    println(arrayDeNomes)

    // Convertendo array para lista
    val listaConvertida = arrayDeNomes.toList()
    println(listaConvertida)


    // Limpando a lista
    listaMutavel.clear()
    println(listaMutavel)
    // Verificando se a lista está vazia
    println("A Lista está vazia? " + listaMutavel.isEmpty())




}