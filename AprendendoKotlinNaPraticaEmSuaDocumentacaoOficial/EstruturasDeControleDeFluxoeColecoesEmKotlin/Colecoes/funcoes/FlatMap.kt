package Colecoes.funcoes

fun main() {
    val fruitsBag = listOf("Apple", "Orange", "Banana")
    val clothesBag = listOf("Shirts", "Pants", "Jeans")
    val cart = listOf(fruitsBag, clothesBag)

    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("Sua bolsas tem: $mapBag")
    println("E todas as coias são: $flatMapBag")
}