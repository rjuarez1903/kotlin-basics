import kotlin.math.sqrt

class Triangle(val a: Int, val b: Int, val c: Int): Shape("Triangle") {
    init {
        println("$name created with sides $a, $b and $c")
    }

    override fun area(): Double {
        val s = (a + b + c) / 2.0
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter() = (a + b + c).toDouble()

    fun isEquilateral() = a == b && b == c
}