package demo

fun main(args: Array<String>) {
    val cities = arrayListOf("Dhaka", "Rajshahi", "Chittagong", "Sylhet", "Rangpur", "Barisal", "Comilla")

    val popCities = hashMapOf("Gazipur" to 100, "Dhaka" to 1000, "Chittagong" to 900)

    // For loop
    for (city in cities) {
        println("City name: $city")
    }

    for ((key, value) in popCities) {
        println("$key = $value")
    }

    var x = 10

    // While loop
    while (x > 0) {
        println(x)
        x--
    }
}