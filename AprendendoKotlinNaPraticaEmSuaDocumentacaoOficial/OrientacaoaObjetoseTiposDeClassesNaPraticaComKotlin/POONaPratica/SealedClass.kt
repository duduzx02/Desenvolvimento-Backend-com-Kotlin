package POONaPratica

sealed class Resultado{
    data class Sucesso(val mensagem: String) : Resultado()
    data class  Erro(val motivo: String) : Resultado()
    object Carregando : Resultado()
}

fun processarResultado(resultado: Resultado){
    when(resultado){
        is Resultado.Sucesso -> println("Sucesso: ${resultado.mensagem}")
        is Resultado.Erro -> println("Erro: ${resultado.motivo}")
        Resultado.Carregando -> println("Carregando...")
    }

}

fun main() {
    val sucesso = Resultado.Sucesso("Operação bem-sucedida")
    val erro = Resultado.Erro("Erro inesperado")
    val carregando = Resultado.Carregando

    processarResultado(sucesso)
    processarResultado(erro)
    processarResultado(carregando)
}