import kotlin.random.Random

class Circle(val radius: Double): Shape("Circle") {
    // This is a companion object
    // It is similar to a static class in Java
    // It can be accessed without creating an instance of the class
    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    private val pi = ImportantNumbers.PI
    // This will be called when we create a new instance of Circle
    init {
        println("$name created with radius $radius")
        println("$name area: ${area()}")
        println("$name perimeter: ${perimeter()}")
        println(ImportantNumbers.function())
    }

    override fun area() = pi * radius * radius

    override fun perimeter() = 2 * pi * radius

}