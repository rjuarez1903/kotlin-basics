fun main() {
    val name = "Rodrigo"
    sayHello(name)
    sayHelloInLowerCase(name)
    sayHelloInUpperCase(name)
    println("Numbers of chars: ${name.length}")
    println("Index 0: ${name[0]}")
    val email = """
        Hello %s
        How 
        Are you
    """.trimIndent()
    println(email.format("Rodrigo"))
}

fun sayHello(name: String) {
    println("Hello $name")
}

fun sayHelloInLowerCase(name: String) {
    println("Hello $name".lowercase())
}

fun sayHelloInUpperCase(name: String) {
    println("Hello $name".uppercase())
}
