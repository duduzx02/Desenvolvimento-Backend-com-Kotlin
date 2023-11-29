package POONaPratica

open class Dog{
    open fun sayHello(){
        println("WOW! ")
    }
}

class Yorkshire : Dog(){
    override fun sayHello() {
        println("WIF!")
    }
}

fun main() {

    val cachorrao = Dog()
    cachorrao.sayHello()

    val cachorro: Dog = Yorkshire()
    cachorro.sayHello()

    val cachorrinho = Yorkshire()
    cachorrinho.sayHello()

}
