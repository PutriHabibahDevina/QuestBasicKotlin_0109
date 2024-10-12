fun ContohList()
{
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOF("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> =
        MutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menambahkan dara dari List Mutable
    shape.remove(element "Triangle")
    println(shape)

    //Menulis data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}