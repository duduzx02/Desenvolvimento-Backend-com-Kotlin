package POONaPratica

// Classe base (superclasse)
open class Animal(val nome: String){
    fun comer(){
        println("$nome está comendo.")
    }
}

// Classe derivada (subaclasse
class Cachorro(nome: String, val raca: String) : Animal(nome){
    fun latir(){
        println("$nome está latindo.")
    }
}

fun main() {
    // Criando uma instância da classe derivada
    val meuCachorro = Cachorro("Buddy", "labrador")

    // Chamando métodos da classe base
    meuCachorro.comer()

    // Chamando métodos da classe derivada
    meuCachorro.latir()
    println(meuCachorro.raca)
}