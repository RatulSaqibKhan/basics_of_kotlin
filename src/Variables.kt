package demo

fun main(args: Array<String>) {
    //  As per Mutability Kotlin has 2 variables:
    //  1. Mutable(value can be changed): This start with keyword var,
    //  2. Immutable(value can't be changed): This start with keyword val

    //  There are some data types: String, Boolean, Integer, Long Integer, Double, Float

    //  Immutable variable with string type
    val name = "Saqib Khan"

    //  Mutable variable with Boolean type
    var isDeveloper = true

    //  Mutable variable with integer type
    var age = 29

    println("My name is $name. I am $age years old. Am I a developer? Answer: $isDeveloper")

    age = 30
    println("My name is $name. I am $age years old. Am I a developer? Answer: $isDeveloper")

    // Integer
    var a = 3
    var b = 2
    println(a+b)

    //Long Integer
    var longNum = 245246537L
    // Double
    var doubleNum = 123.45
    // Float
    var floatNum = 123.45f

    println("$longNum \t $doubleNum \t $floatNum")

    // Type casting
    val aString = a.toString()
    print(aString)

}