// An abstract class is a class that cannot be instantiated, but can contain abstract methods
abstract class Shape(var name: String) {

    // This allows us to construct our custom shapes on the fly
    constructor(name: String, vararg dimensions: Double): this(name)

    init {
        println("i am a super class")
    }

    fun changeName(newName: String) {
        name = newName
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double
}