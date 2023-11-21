fun main() {
    for (i in 0..3){
        print(i)
    }
    println("")

    for(i in 0 until 3){
        print(i)
    }

    println()

    for(i in 2..8 step 2 ){
        print(i)
    }
    println()

    for(i in 3 downTo 0){
        print(i)
    }

    println()
    for (a in 'a'..'z'){
        print(a)
    }

    println()

    for (a in 'z' downTo 'a'){
        print(a)
    }

    println()
    val x =2
    if (x in 1..5){
        print("X está no range de 1 a 5")
    }

    println()

    if( x !in 6..40){
       print("X não está no range de 6 a 40")
    }
}