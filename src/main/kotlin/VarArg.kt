fun main() {
    val array = intArrayOf(20, 30, 40, 50)
    // We don't need to pass an array to the function, just as many arguments as we want
    val max = getMax(1, 2, 3, 4, 5, *array, 6, 7, 8, 9)
    println("Max: $max")
    searchFor("Kotlin")
    searchFor("Kotlin", "Bing")
    val numbers = listOf(1, 2, 3, 4, 5)
    println(indexOf(numbers, 6))

}

// We can use default values for parameters
fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for $search on $searchEngine")
}

// We can use vararg to pass a variable number of arguments to a function
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

/*
    IndexOf function, using lambdas
    In this function, we use the forEachIndexed method from the List interface
*/
fun indexOf(numbers: List<Int>, number: Int): Int {
    numbers.forEachIndexed { index, it ->
        if (it == number) {
            return index
        }
    }
    return -1
}