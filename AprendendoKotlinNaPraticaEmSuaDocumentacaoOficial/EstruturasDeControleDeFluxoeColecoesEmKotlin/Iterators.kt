class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
            return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("Zebra"), Animal("Lion"))
    val zoo = Zoo(animals)

    for (animal in zoo){
        println("Watch ou, it's a ${animal.name}")
    }
}