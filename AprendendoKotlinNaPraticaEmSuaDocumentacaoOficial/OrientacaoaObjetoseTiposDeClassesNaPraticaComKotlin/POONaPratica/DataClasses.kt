package POONaPratica

data class Pessoa(val nome: String, val idade: Int)


fun main() {
    // Criando instâncias da data class
    val pessoa1 = Pessoa("Alice", 25)
    val pessoa2 = Pessoa("Bob", 30)

    // Acesso às propriedades
    println("Nome: ${pessoa1.nome}, Idade: ${pessoa1.idade}")

    // Comparando instâncias (usando equals gerado automaticamente)
    val saoiguais = pessoa1 == pessoa2
    println("São as mesmas pessoas? $saoiguais")

    // Copiando instância com modificação de propriedade
    val pessoa3 = pessoa1.copy(idade = 26)
    println("Pessoas original: $pessoa1")
    println("Pessoa copiada com idade modificada: $pessoa3")
}