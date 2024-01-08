fun main() {
    // Equivalent to Java's switch statement
    var gender = "F"
    gender = "M"
    when (gender) {
        "F" -> println("Female")
        "M" -> println("Male")
        else -> println("Other")
    }
    // We can assign the result of when to a variable
    val result = when(gender) {
        "F" -> "Female"
        "M" -> "Male"
        else -> "Other"
    }
    println(result)

    // We can use ranges
    val age = 10
    when (age) {
        in 0..2 -> println("Baby")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle-aged")
        else -> println("Elderly")
    }

    // We can use multiple conditions
    val name = "Rodrigo"
    when {
        name.startsWith("R") -> println("Starts with R")
        name.endsWith("o") -> println("Ends with o")
        name.contains("dri") -> println("Contains dri")
    }
}