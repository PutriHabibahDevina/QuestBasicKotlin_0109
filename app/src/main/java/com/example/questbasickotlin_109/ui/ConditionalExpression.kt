package com.example.questbasickotlin_109.ui

// Conditional Expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch
fun conditionalStatement() {
    println("=== Conditional Expression ===")

    // Ambil input angka dari pengguna
    print("Masukkan angka: ")
    val number = readlnOrNull()?.toIntOrNull() ?: 0

    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // Ambil input hari dari pengguna
    print("Masukkan hari (1-7): ")
    val day = readlnOrNull()?.toIntOrNull() ?: 0

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
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

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
    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

fun main() {
    conditionalStatement()
    perulangan()
}