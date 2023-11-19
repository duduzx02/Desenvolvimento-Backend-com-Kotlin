package Introducao

// Varargs → permite que passe qualquer número de argumentos separando-os com vírgulas.

fun main() {
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }

    fun log(vararg entries: String){
        printAll(*entries)
    }


    log("Hello", "Hallo", "Salut", "Hola", "你好") // Quando
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Gretting: , ") // Pode definir um valor
    // para prefixar separadamente do vararg.
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")  // Com o varagrs permite chamar o printAll com qualquer número
// de argumentos de string.
}