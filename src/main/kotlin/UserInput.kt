fun main() {
    println("What's your name?")
    val name = readlnOrNull()
    println("Hello $name")

    // Another way to do it. We check if the value is null before using it
    val name2 = readLine()
    println("Hello ${name2?.uppercase()}")
}