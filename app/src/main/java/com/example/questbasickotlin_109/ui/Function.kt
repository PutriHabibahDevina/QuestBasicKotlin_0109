package com.example.questbasickotlin_109.ui

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, PAM!")
}

fun withParameter(name: String) {
    println() // Mencetak baris kosong untuk pemisah
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name ! You are $age years old.")
}

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hellom $name! you are $age years old. ")
}

// Fungsi dengan return statement yang mengembalikan hasil perkalian panjang dan lebar
fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main () {
    withoutParameter()
    withParameter("john")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}