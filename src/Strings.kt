package demo

fun main(args: Array<String>) {
    // String learning
    // 1. Escaped String (use of escaped character e.g. \n \t \ etc) (mostly used)
    // 2. Raw String (multi-line)

    var str1 = "This is a sample String"
    println(str1)

    // newline character \n
    str1 = "This is a\n sample String"
    println(str1)

    // backspace character \b
    str1 = "This is a\b  sample String"
    println(str1)

    str1 = "He said that he couldn\'t do the housekeeping!"
    println(str1)

    // tab character \t
    str1 = "He said that he could\t do the housekeeping!"
    println(str1)

    // remove character \r
    str1 = "He said that he could\r do the housekeeping!"
    println(str1)

    var rawStringVal = """ A long long time ago;
        There is a King.
        He has 3 daughters and 4 sons.
    """
    println(rawStringVal)

    rawStringVal = """ |A long long time ago;
        |There is a King.
        |He has 3 daughters and 4 sons.
    """.trimMargin()
    println(rawStringVal)

    // String functions
    val str2 = "My name is Saqib Khan"

    val contentEquals = str2.contentEquals("My name is Saqib Khan")
    println(contentEquals)

    val containCharStr2 = str2.contains("saqib", true)
    println(containCharStr2)

    val subsequenceStr2 = str2.subSequence(10, 21)
    println(subsequenceStr2)

    val uppercaseStr2 = str2.toUpperCase()
    println(uppercaseStr2)

    val lowercaseStr2 = str2.toLowerCase()
    println(lowercaseStr2)

    // String print options
    val name = "Saqib Khan"
    var age = 29

    println("My name is $name. My age is $age")
    println("My name is ${name.toUpperCase()}. My age is ${age + 1}")
    println("My name is " + name + ". My age is " + age)

    // Loop through String
    for (char in subsequenceStr2) {
        println(char)
    }

}