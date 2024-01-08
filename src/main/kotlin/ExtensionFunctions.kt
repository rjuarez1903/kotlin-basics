fun main() {
    println("Please enter a number:")
    val input = readLine()?.toInt()

    if (input != null) {
        println(input.isPrime())
    }

}
/*
    Extension functions are functions that we can add to existing classes
    We can add functions to any class, even classes that we don't own
*/
fun Int.isPrime(): Boolean {
    if (this <= 1) return false

    for (i in 2 until this) {
        if (this % i == 0) return false
    }

    return true
}