package POONaPratica

fun main() {
    val hoje = DiaDaSemana.QUARTA

    when(hoje){
        DiaDaSemana.DOMINGO -> println("Dia de descanso!")
        DiaDaSemana.SABADO -> println("Dia de diversão!")
        else -> println("Dia útil.")

    }

}