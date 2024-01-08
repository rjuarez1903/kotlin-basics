fun main() {
    val triple = CustomTriple(1, "Second", true)
    triple.printTypes()
}

// This is how we can create a custom triple class:
class CustomTriple<A : Any, B : Any, C : Any>(val first: A, val second: B, val third: C) {
    fun printTypes() {
        println("A is ${first::class.simpleName}")
        println("B is ${second::class.simpleName}")
        println("C is ${third::class.simpleName}")
    }
}