package demo

class Car(val make: String, val model: String, var color: String) {
    fun accelerate() {
        println("$make $model starts with vroom vroom!! :)")
    }

    fun details() {
        println("This is a $color $make $model")
    }
}

class Truck(private val make: String, private val model: String, var towingCapacity: Int) {
    fun accelerate() {
        println("$make $model starts with vrooooooooom!! :)")
    }

    fun details() {
        println("The $make $model can tow up to $towingCapacity tons")
    }
}

fun main(args: Array<String>) {
    val car = Car("Mitshubishi", "Lancer", "Blue")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ashok Leyland", "AL-10112", 1000)
    truck.accelerate()
    truck.details()
}