import kotlin.random.Random

class Rectangle(val a: Double, val b: Double): Shape("Rectangle") {
    /*
        Secondary constructor
        This will be called when we create a new instance of Rectangle
        This constructor calls the primary constructor
    */
    constructor(a: Double): this(a, a)

    companion object {
        fun randomRectangle(): Rectangle {
            val a = Random.nextDouble(1.0, 10.0)
            val b = Random.nextDouble(1.0, 10.0)
            return Rectangle(a, b)
        }
    }

    // This will be called when we create a new instance of Rectangle
    init {
        println("$name created with sides $a and $b")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * (a + b)

    fun isSquare() = a == b
}