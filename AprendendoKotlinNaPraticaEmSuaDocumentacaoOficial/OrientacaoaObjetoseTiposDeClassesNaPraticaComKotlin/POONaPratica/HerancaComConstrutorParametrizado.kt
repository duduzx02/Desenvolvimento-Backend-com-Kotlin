package POONaPratica

open class Tiger(val origin: String){
    fun sayHello(){
        println("O Tigre do $origin fala: grrhhhh!")
    }

}

class SiberianTiger : Tiger("Siberia")

fun main() {
    val tiger : Tiger = SiberianTiger()
    tiger.sayHello()

}