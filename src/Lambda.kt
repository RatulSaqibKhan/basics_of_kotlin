package demo

fun main(args: Array<String>) {
    // Lambda expression is a function literal; always starts and ends with curly brackets {}
    val printMessage = { message: String -> println(message) }

    printMessage("I am the Hulk!")

    // Multiple Arguments: 1st way
    val sumVals = { x: Int, y: Int -> x + y }

    println(sumVals(12, 13))

    // Multiple Arguments: 2nd way
    val sumTwoNums: (Int, Int) -> Int = { x, y -> x + y }

    println(sumTwoNums(14, 23))

    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there was no internet errors
        completion()
    }

    // Call downloadData Function
    downloadData("fakeurl.com") {
        println("The code and this block will only run after the completion()")
    }

    fun downloadCarData(url : String, completion : (Car) -> Unit) {
        // sent a download request
        // we got back car data
        val car = Car("Tesla", "ModelX", "Red")
        completion(car)
    }

    downloadCarData("fakecar.com") {car ->
        println(car.make)
        println(car.model)
    }

    // it keyword
    downloadCarData("fakecar.com") {
        println(it.make)
        println(it.model)
    }

    fun downloadTruckData(url : String, completion : (Truck?, Boolean) -> Unit) {
        // sent a download request
        val webRequest = true
        if (webRequest) {
            // we got back car data
            val truck = Truck("Ford", "FK-102", 1000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeTruck.com") {truck, success ->
        if (success) {
            println(truck?.towingCapacity)
            truck?.details()
        } else {
            // Error message
            println("Something went wrong")
        }
    }
}