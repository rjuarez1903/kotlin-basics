fun main() {
    val isAdult: Boolean? = null

    // When Booleans are null, we have to perform a null check
    if (isAdult == true) {
        println("Is adult")
    } else if (isAdult == false) {
        println("Is not adult")
    } else {
        println("Is null")
    }

    // We can use the Elvis operator to provide a default value
    val isAdult2 = isAdult ?: false
    println(isAdult2)
}