package FuncaoDeEscopo

class Configuration(var host: String, var port: Int)

val resultado2 = with("Mundo"){
    val saudacao = "Olá"
    "$saudacao, $this"
}



fun main() {
    println(resultado2)
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration){
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")
}