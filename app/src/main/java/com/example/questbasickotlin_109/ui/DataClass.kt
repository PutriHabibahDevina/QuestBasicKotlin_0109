package com.example.questbasickotlin_109.ui

// Data class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int, //variabelnya tidak dapat diubah
    var email: String //variabelnya dapat diubah
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    // Fungsi Equals
    // Membuat objek kedua dengan id yang sama tetapi email yang berbeda
    val data2 = DataClass(1, "makan@gmail.com")
    // Membandingkan dua objek menggunakan operator '==', yang pada Data Class membandingkan isi (value) dari objek
    println(data == data2) // false

    // Fungsi Copy
    val data3 = data.copy() // Membuat salinan dari objek data tanpa perubahan
    println(data3)

    // Fungsi Copy dengan perubahan
    val data4 = data.copy(email = "sahar@gmail.com") // Membuat salinan dari objek data dengan mengubah properti email menjadi "sahar@gmail.com"
    println(data4)
}
