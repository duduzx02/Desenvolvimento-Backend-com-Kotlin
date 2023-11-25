package Colecoes

fun main() {

    //DicionarioCores
    val dicionarioCores = mutableListOf(
            "Vermrlho" to "FF0000",
            "Verde" to "00FF00",
            "Azul" to "0000FF"
    )

    for((chave, valor) in dicionarioCores){
        println("Chave: $chave e Valor: $valor")
    }

    // Pontuação dos jogadores
    val pontuacoesJogadores = mutableMapOf(
            "Jogador1" to 100,
            "Jogador2" to 85,
            "Jogador" to 120
    )

    for((chave, valor) in pontuacoesJogadores){
        println("Chave: $chave e Valor: $valor")
    }

    // Idade de pessoas
    val idades = mutableMapOf(
            "Alice" to 25,
            "Bob" to 30,
            "Charlie" to 22
    )

    println(idades)
    idades.remove("Alice")

    println(idades)


    val produtosPrecos = mapOf(
            "Celular" to 1000.0,
            "Notebook" to 1500.0,
            "Tablet" to 500.0
    )


    println("digite o nome do produto: ")
    val produtoInserido = readLine()

    if(produtoInserido in produtosPrecos){
        println("O produto está no mapa")
    } else {
        println("O produto não está no mapa")
    }
}