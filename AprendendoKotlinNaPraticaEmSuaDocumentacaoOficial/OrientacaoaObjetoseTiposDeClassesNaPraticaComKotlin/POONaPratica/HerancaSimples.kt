package POONaPratica

// Classe base (superclasse)
open class Animal(val nome: String){
    fun comer(){
        println("$nome está comendo.")
    }
}

// Classe derivada (subaclasse) com construtor parametrizado
class Cachorro(nome: String, val raca: String) : Animal(nome){
    // Novo construtor de classe derivada

    constructor(nome: String, raca: String, idade: Int): this(nome, raca){
        println("$nome é um charro da raça $raca e tem $idade anos.")
    }

    fun latir(){
        println("$nome está latindo.")
    }
}

fun main() {
    // Criando uma instância da classe derivada
    val meuCachorro = Cachorro("Buddy", "labrador", 3)

    // Chamando métodos da classe base
    meuCachorro.comer()

    // Chamando métodos da classe derivada
    meuCachorro.latir()
    println(meuCachorro.raca)
}