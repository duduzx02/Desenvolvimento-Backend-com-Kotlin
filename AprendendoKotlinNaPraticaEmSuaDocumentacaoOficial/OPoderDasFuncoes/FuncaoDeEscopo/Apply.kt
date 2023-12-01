package FuncaoDeEscopo

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)


    val pessoa = Person("Alice", 25, "Developer software").apply {
        name = "Bob"
        age = 30
        about = "teste teste"
     }

    println(pessoa )
}