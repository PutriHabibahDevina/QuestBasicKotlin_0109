package com.example.questbasickotlin_109.ui

// Deklarasi kelas Motor tanpa properti atau fungsi tambahan
class Motor()

//id read-only (val) atau tidak dapat diubah
//email mutable (var) atau dapat diubah
class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "mary@gmail.com")

    //Prints the value of the property: email
    println(contact.email)

    //Updates the value of the property: email
    contact.email = "jane@gmail.com"

    //Prints the new value of the property: email
    println(contact.email)
}