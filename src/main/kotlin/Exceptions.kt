fun main() {
    /*
     Exceptions are errors that happen during the execution of the program
     They can be caused by a variety of reasons, such as:
     - Trying to divide by zero
     - Trying to access an index that doesn't exist in a list
     - Trying to convert a string to a number, but the string doesn't contain a valid number
     - Trying to access a file that doesn't exist
     - Trying to access a database that doesn't exist
     The try-catch block allows us to handle exceptions
     We can use the try block to execute code that might throw an exception
     If an exception is thrown, the code inside the catch block will be executed
     If no exception is thrown, the code inside the catch block will be ignored
     The finally block will always be executed, regardless of whether an exception is thrown or not
     The finally block is optional
     The finally block is usually used to close resources, such as files or database connections
     */
    println("Please enter a number:")
    val input = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        println("Please enter a valid number")
        0
    } finally {
        println("This is from the finally block")
    }
    println("You entered: $input")

    val division = try {
        divide(10, 0)
    } catch (e: DivideByZeroException) {
        println(e.message)
        0.0
    }
    println("Division result: $division")
}

/*
 We can also create our own exceptions
 We can create a class that extends the Exception class
 We can use the constructor of the Exception class to set the message of the exception
 */
class DivideByZeroException : Exception("You can't divide by zero, please enter a valid number")

/*
 We can use the throw keyword to throw an exception
 We can use the try-catch block to handle the exception
 */
fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw DivideByZeroException()
    }
    return a / b
}