package Introducao
// Kotlin possui inferência de tipos poderosa.
// O kotlin não impôe imutabilidade, embora seja recomendado. Em essência, use val sobre var.

fun main() {
    var a: String = "initial" // Declara uma variável mutável e a inicializa.
    println(a)
    var b = "final" // Declara uma variável mutável e a inicializa sem espeficicar o tipo, O compilador infere o tipo.
    println(b)
    a = "pode?"     //
    println(a)

    val c: Int = 1 // Declara uma variável imutável.
    val d = 3



    val e: Int  // Declara uma variável sem inicializar.

    if(true){
        e = 1
    } else  {
        e = 3
    }
                    // Inicializa a variável com valores diferentes dependendo de uma das condições for tru
    println(e)

}