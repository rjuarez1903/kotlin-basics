fun main() {

    val list = (1..20).toList()
    println(list)
    /*
        Lambda functions are functions that are not declared, but passed immediately as an expression
        We can use the filter method to filter the list
    */
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)
    // We can use the map method to transform the list
    val doubledNumbers = list.map { it * 2 }
    println(doubledNumbers)
    // We can use the reduce method to reduce the list to a single value
    val sum = list.reduce { acc, number -> acc + number }
    println(sum)

    val circle1 = Circle(2.0)
    val circle2 = Circle(3.0)
    val triangle1 = Triangle(2, 3, 4)
    val triangle2 = Triangle(3, 4, 5)
    val rectangle1 = Rectangle(2.0, 3.0)
    val rectangle2 = Rectangle(3.0, 4.0)
    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)

    // We can use the filter method to filter the list, and the sortedBy method to sort the list
    shapes = shapes.filter { it.area() > 10 }.sortedBy { it.area() }
    shapes.forEach { println("Shape name: ${it.name}. Area: ${it.area()}") }

    // We can use the customFilter function to filter the list. We'll get the same result
    shapes = shapes.customFilter { it.area() > 10 }.sortedBy { it.area() }
    shapes.forEach { println("Shape name: ${it.name}. Area: ${it.area()}") }
}

/*
    We can create an extension function to filter a list
    The filter function receives a lambda function as a parameter
    The lambda function receives a Shape as a parameter, and returns a Boolean
    The filter function returns a list of Shape
*/
fun List<Shape>.customFilter(filterFunction: (Shape) -> Boolean): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)) {
            resultList.add(shape)
        }
    }
    return resultList
}