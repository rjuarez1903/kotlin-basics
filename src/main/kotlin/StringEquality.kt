fun main() {
    val name1 = "Rodrigo"
    val name2 = "Marina"
    val name3 = String("Rodrigo".toCharArray())

    // Compares the memory location
    println(name1 === name3)

    // Compares the values
    println(name1 == name3)
    println(name1.equals(name3, true))
    println(name1.equals(name2, true))
}