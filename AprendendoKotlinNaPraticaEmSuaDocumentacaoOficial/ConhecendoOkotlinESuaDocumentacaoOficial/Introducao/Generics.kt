package Introducao

class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

 /* fun main() {
    val stack = MutableStack(0.63,  3.14, 2.7)
    println("push(9.00): ${stack.push(9.00)}")
    println("push(7.00): ${stack.push(7.00)}")

    println(stack)

    println("peek(): ${stack.peek()}")

    for(i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    println("isEmpty(): ${stack.isEmpty()}")
}
*/

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.6, 3.14,4.9)
    println(stack)
}