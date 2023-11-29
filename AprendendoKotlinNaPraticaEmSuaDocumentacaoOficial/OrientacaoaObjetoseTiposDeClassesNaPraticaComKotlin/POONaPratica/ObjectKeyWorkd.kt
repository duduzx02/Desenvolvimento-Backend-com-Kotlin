package POONaPratica

import java.util.Random

class LuckDispatcher{
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

object Configuracao{
    var nomeAplicacao: String = "MinhaApp"
    var versao: String = "1.0"
}

fun main() {

    println("Nome da aplicação: ${Configuracao.nomeAplicacao}")
    println("Versão: ${Configuracao.versao}")

    // Alterando valores
    Configuracao.nomeAplicacao = "NovaApp"
    Configuracao.versao = "2.0"

    println("Nome da aplicação: ${Configuracao.nomeAplicacao}")
    println("Versão: ${Configuracao.versao}")

    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
}