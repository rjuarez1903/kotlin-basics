fun main() {
    // Notice that we don't need to specify the type of the array. It's inferred and it's immutable
    val array = arrayOf(1, 2, 3, 4, 5)
    println(array[0])
    array.forEach { print("$it ") }
}