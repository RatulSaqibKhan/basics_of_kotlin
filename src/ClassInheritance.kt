package demo

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("Starts with vroom vroom")
    }

    fun breakToStop() {
        println("STOP!")
    }

}

class CarDemo(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("$make $model starts with vroom vroom!! :)")
        super.accelerate()
    }

    fun details() {
        println("This is a $color $make $model")
    }
}

class TruckDemo(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model) {
    fun details() {
        println("The $make $model can tow up to $towingCapacity tons")
    }
}

fun main(args: Array<String>) {
    val car = CarDemo("Mitshubishi", "Lancer", "Blue")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.breakToStop()
    car.details()

    val truck = TruckDemo("Ashok Leyland", "AL-10112", 1000)
    truck.accelerate()
    truck.details()
}