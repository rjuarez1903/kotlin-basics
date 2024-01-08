/*
    Generics allow us to create classes, interfaces, and functions that can work with any type
    Generics are a way to tell the compiler that we want to use a type that is only known at runtime
*/

fun main() {
    // In this case, we're filtering a list of integers, but we can filter a list of any type
    var evenNumbers = (1..10).toList().customFilter { it % 2 == 0 }
    println(evenNumbers)

    // Classes can be generic too
    // Triple is a generic class that can hold three values of any type
    var triple = Triple<Int, String, Boolean>(1, "Hello", true)
    // We don't need to specify the types, they're inferred.
    // We can also use the Triple constructor without specifying the types
    // var triple = Triple(1, "Hello", true)


}


// T means that the function can work with any type
fun <T> List<T>.customFilter(filterFunction: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (element in this) {
        if (filterFunction(element)) {
            resultList.add(element)
        }
    }
    return resultList
}

// We can limit the types that can be used with generics. For expample, we can limit the types to numbers
fun <T : Number> List<T>.numbersCustomFilter(filterFunction: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (element in this) {
        if (filterFunction(element)) {
            resultList.add(element)
        }
    }
    return resultList
}