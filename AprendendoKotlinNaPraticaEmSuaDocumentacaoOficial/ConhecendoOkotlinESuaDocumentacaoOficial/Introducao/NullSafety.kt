package Introducao

fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null // ERROR

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null  // ERROR

    fun strLength(str: String?): Int{
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable))
}
