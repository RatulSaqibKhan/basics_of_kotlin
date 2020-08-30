package demo

fun main(args: Array<String>) {
//    var name: String = "I am a robot"
//    name = null

    var nullableName: String? = "Google"
    //nullableName = null

    // First way
    val length = if (nullableName != null) nullableName.length else -1
    println(length)

    // Second way Safe call operator ?
    println(nullableName?.length)

    // Third way Elvis operator
    println(nullableName?.length ?: -1)
    println(nullableName ?: "No one knows me")

    // !!
    println(nullableName!!.length)

}