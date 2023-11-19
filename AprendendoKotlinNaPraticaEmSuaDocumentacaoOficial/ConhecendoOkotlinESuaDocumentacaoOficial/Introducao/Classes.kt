package Introducao

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contact = Contact(1, "Duduzx01@gmail.com")

    println(contact.id)
    contact.email = "duduzx02@gmai.com"
    println(contact.email)
}