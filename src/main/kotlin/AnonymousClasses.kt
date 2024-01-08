fun main() {
    val a = 5.0
    val b = 2.0
    val height = 2.0
    /*
        Anonymous class
        An anonymous class is a class that doesn't have a name
        We can use anonymous classes to create objects that extend a class or implement an interface
     */
    val parallelogram = object : Shape("Parallelogram", a, b, height) {
        init {
            println("$name created with base $a, side $b, and height $height")
            println("$name area: ${area()}")
            println("$name perimeter: ${perimeter()}")
        }
        override fun area() = a * height
        override fun perimeter() = 2 * (a + b)

        fun isRectangle(): Boolean = height == b
    }
    println("Parallelogram is a rectangle: ${parallelogram.isRectangle()}")
}