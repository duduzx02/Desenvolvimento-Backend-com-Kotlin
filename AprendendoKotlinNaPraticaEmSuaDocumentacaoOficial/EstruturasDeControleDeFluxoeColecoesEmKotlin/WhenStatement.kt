fun cases(obj: Any){
    when (obj){
        1 -> println("One")
        "Hello" -> println("Greting")
        is Long -> println("Long")
        !is String -> println("not a string")
        else -> println("Unknown")
    }
}

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

class MyClass