val authors = setOf("Shakespeare", "Hemingway", "Twain")
val writes = setOf("Twain", "Shakespeare", "Hemingway")

val str1: String = "Hello"
val str2: String = "Hello"

val num1: Int = 42
val num2: Int = 42

data class Person(val name: String, val age: Int)

val a: String? = "Kotlin"
val b: String? = null
val c: String? = "Java"

val list1 = listOf(1, 2, 3)
val list2 = listOf(1, 2, 3)

val x: Int = 42
val y: Int? = 42


fun main() {
    println(authors == writes) // Retorna true porque chama authors.equals(writes) e define para ignorar a ordem dos
    // elementos
    println(authors === writes) // Retorna falso porque authors e writes são referências distindas.

    println(str1 == str2)
    println(str1 === str2)

    println(num1 == num2)
    println(num1 === num2)

    println(a.equals(c))
    println(b.equals(null))

    println(list1 == list2)
    println(list1 === list2)

    println(x == y)
    println(x === y)

    val person1 = Person("Alice", 25)
    val person2 = Person("Alice", 25)

    println(person1 == person2)
    println(person1 === person2)
}
