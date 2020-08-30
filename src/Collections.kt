package demo

fun main(args: Array<String>) {
    // 2 Types: 1. Mutable Collection, 2. Immutable Collection

    // Immutable Array use listOf
    val fruits = listOf("apple", "banana", "malta", "orange", "guava", "grape", "mango")

    println(fruits)
    println(fruits.first())
    println(fruits.last())
    println(fruits.contains("mojart"))
    println(fruits[2])
    println(fruits.sorted())

    // Mutable Array use arrayListOf
    val cities = arrayListOf("Dhaka", "Rajshahi", "Chittagong", "Sylhet", "Rangpur", "Barisal", "Comilla")
    println(cities)
    println(cities.size)

    cities.add("Khulna")
    println(cities)

    cities.add(0, "Gazipur")
    println(cities)
    println(cities.sorted())

    println(cities.indexOf("Sylhet"))

    cities.remove("Rangpur")
    println(cities)

    // Array or collections in key value pairs
    // 2 Types: 1. Immutable, 2. Mutable

    // Immutable using mapOf
    val populationCities = mapOf("Gazipur" to 100, "Dhaka" to 1000, "Chittagong" to 900)
    println(populationCities)
    println(populationCities["Dhaka"])
    println(populationCities.get("Chittagong"))
    println(populationCities.getOrDefault("Rajshahi", "No result found"))

    val popCities = hashMapOf("Gazipur" to 100, "Dhaka" to 1000, "Chittagong" to 900)
    popCities["Rajshahi"] = 200
    popCities.put("Barisal", 500)
    println(popCities)
    popCities.remove("Dhaka")
    println(popCities)
    println(popCities.isEmpty())

}