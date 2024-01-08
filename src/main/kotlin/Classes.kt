fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("Rectangle area: ${rectangle.area()}")
    println("Rectangle perimeter: ${rectangle.perimeter()}")
    println("Is rectangle a square: ${rectangle.isSquare()}")
    val circle = Circle(5.0)
    val circle2 = Circle(2.0)

    val triangle = Triangle(3, 4, 5)
    triangle.changeName("Triangle ABC")
    println(triangle.name)

    val circle3 = Circle.randomCircle()
    println(circle3.radius)
}