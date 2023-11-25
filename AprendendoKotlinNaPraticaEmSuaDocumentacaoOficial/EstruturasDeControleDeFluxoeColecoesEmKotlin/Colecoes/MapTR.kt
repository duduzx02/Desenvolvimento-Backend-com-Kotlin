package Colecoes

//# Criando um mapa mutável
val mapaMutavel = mutableMapOf(
        "chave" to "valor",
        "chave1" to "valor1",
        "chave2" to "chave2"
)

// Criando um mapa imutável
val mapaImutavel = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3

)

fun main() {
    // Acessando Elementos em um Mapa:
    val valor = mapaMutavel["chave"]
    println(valor)

    val contemChave = mapaMutavel.containsKey("chave2")
    println(contemChave)

    // Iterando sobre pares chave-valor

    for((chave, valor) in mapaImutavel){
        println("Chace: ${chave}, Valor: ${valor}")
    }

    for(chave in mapaMutavel){
        println(chave)
    }

    for (chave in mapaMutavel.keys){
        println(chave)
        println("${ mapaMutavel[chave]}")
    }

    // Operações de modificação em um mapa mutável
    // Adicionando um novo par chave-valor
    mapaMutavel["nova Chave"] = "novo Valor"
    // Removendo um par chave-valor por chave
    mapaMutavel.remove("chave2")

    println(mapaMutavel)

    // Obtendo valores por padrão
    val valorOrDefault = mapaMutavel.getOrDefault("Chave2", "Valor Padrão")
    println(valorOrDefault)
}