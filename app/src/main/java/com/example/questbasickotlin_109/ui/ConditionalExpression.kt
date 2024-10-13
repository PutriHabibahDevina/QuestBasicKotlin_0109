package com.example.questbasickotlin_109.ui

// Conditional Expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch

/*Fungsi ini menggunakan if-else, when, dan try-catch*/
fun conditionalStatement() {
    println("=== Conditional Expression ===")

    // Ambil input angka dari pengguna
    print("Masukkan angka: ")
    // Membaca input dari pengguna, mencoba mengonversi ke Int, jika gagal menggunakan 0
    val number = readlnOrNull()?.toIntOrNull() ?: 0

    // Menggunakan if-else untuk menentukan apakah angka positif atau negatif
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // Ambil input hari dari pengguna
    print("Masukkan hari (1-7): ")
    // Membaca input dari pengguna, mencoba mengonversi ke Int, jika gagal menggunakan 0
    val day = readlnOrNull()?.toIntOrNull() ?: 0

    // Menggunakan when untuk menentukan nama hari berdasarkan angka yang dimasukkan
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    // Try-Catch
    val value = "10"
    try {
        val result = value.toInt() // Mencoba mengonversi string ke Int
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number") // Menangani kasus jika string tidak bisa dikonversi ke Int
    }
}

/*Fungsi ini menggunakan perulangan seperti for loop, for-each loop, while loop, dan do-while loop*/
fun perulangan() {
    println()
    println("=== Perulangan ===")

    // For Loop
    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    // For-each Loop
    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    // While Loop
    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    // Do-While Loop
    var y = 1 // Melakukan perulangan minimal sekali, kemudian memeriksa kondisi
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

fun main() {
    conditionalStatement()
    perulangan()
}