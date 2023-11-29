package POONaPratica

data class User(val name: String, val id: Int){
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)
    val fourUser = User("Outro nome", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirUser: ${user == thirdUser}")
    println("thirdUser == fourUser: ${thirdUser == fourUser}")

    // hashCode() function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())
    println(user === user.copy())
    println(user == user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))

    println("Name = ${user.component1()}")
    println("Id = ${user.component2()}")


}
