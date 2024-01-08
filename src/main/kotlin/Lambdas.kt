fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    /*
        In JavaScript, we would use the filter method like this:
        const evenNumbers = numbers.filter(number => number % 2 === 0)
        In Kotlin, we can use the filter method like this:
    */
    val evenNumbers = numbers.filter { it % 2 == 0}
    // We can be more explicit and use the following syntax:
    val evenNumbers2 = numbers.filter { number -> number % 2 == 0}
    /*
    In Java, we could use the Stream API like this:
    List<Integer> evenNumbers = numbers.stream()
         .filter(number -> number % 2 == 0)
         .collect(Collectors.toList());
    */
}