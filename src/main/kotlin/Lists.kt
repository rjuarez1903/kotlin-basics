fun main() {
    /*
        Array vs List
        Arrays are mutable by default. We can add or remove elements from it
    */
    val array = arrayOf("Rodrigo", "Marina", "Renata")
    // We can add elements to the array, using the plus operator
    val array2 = array + "Paco"
    array2.forEach { print("$it ") }
    print("\n")
    /*
        List are immutable by default. We can't add or remove elements from it
        Instead, we can use a MutableList. It's mutable, and we can add or remove elements from it
    */
    val list = mutableListOf("Rodrigo", "Marina", "Renata")
    // We can add elements to the list, using the plus operator
    list += "Paco"
    list.forEach { print("$it ") }
    print("\n")
    // We can also use the add method
    list.add("Simona")
    /*
        The list is now: Rodrigo, Marina, Renata, Paco, Simona
        Also, we can print the list using println(list)
    */
    println(list)
    // We can remove elements from the list, using the minus operator or the remove method
    list.remove("Rodrigo")
    // The removeAt method removes an element at a specific index
    list.removeAt(1)

    // List of integers
    val numbers = mutableListOf<Int>()
    // A for loop from 1 to 10
    for (i in 1..10) {
        numbers.add(i)
    }
    println(numbers)
}