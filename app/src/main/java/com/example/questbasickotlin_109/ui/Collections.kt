package com.example.questbasickotlin_109.ui

// List adalah kumpulan data yang disusun secara berurutan
// List bersifat ordered, artinya data yang dimasukkan memiliki posisi sesuai urutan
// List bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

/*Fungsi ini menampilkan perbedaan antara List Read-Only dengan Mutable*/
fun ContohList() {
    println("=== List ===") //Mencetak header untuk bagian List

    // List Read-Only
    // Menggunakan listOf untuk membuat List yang tidak dapat diubah setelah dibuat
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad) // Mencetak isi dari readOnlyAbjad

    // List Mutable
    // Menggunakan mutableListOf untuk membuat List yang dapat diubah
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape) // Mencetak isi awal dari shape

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle") // Menambahkan elemen "Circle" ke dalam List shape
    println(shape) // Mencetak isi List setelah penambahan

    // Menghapus data dari List Mutable
    shape.remove("Triangle") // Menghapus elemen "Triangle" dari List shape
    println(shape) // Mencetak isi List setelah penghapusan

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval" // Mengubah elemen pertama dari "Circle" menjadi "Oval"
    println(shape) // Mencetak isi List setelah perubahan

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked) // Mencetak isi dari shapesLocked yang tidak dapat diubah
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik (tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

/*Fungsi ini menampilkan perbedaan antara Set Read-Only dengan Mutable*/
fun ContohSet() {
    println("=== Set ===")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked) // Mencetak isi dari shapesLocked yang tidak dapat diubah
}

// Map adalah kumpulan data yang disusun dalam pasangan key-value
// Map bersifat ordered, artinya data yang dimasukkan memiliki posisi tertentu
// Map bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

/*Fungsi ini menampilkan perbedaan antara Map Read-Only dengan Mutable*/
fun ContohMap() {
    println("=== Map ===")

    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4 // Menambahkan pasangan key-value "Rectangle" -> 4 ke dalam Map shape
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle") // Menghapus pasangan key-value dengan key "Circle" dari Map shape
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5 // Mengubah nilai dari key "Square" menjadi 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape // Mengonversi menjadi Map Read-Only
    println(shapesLocked) // Output: {Circle=1, Square=2, Triangle=3}
}

//Memanggil fungsi-fungsi di atas
fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}