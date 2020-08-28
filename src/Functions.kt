package demo

fun main(args: Array<String>) {
    fun introduction() {
        println("Hello there! How are you doing?")
    }

    introduction()

    fun greetYou(name: String) {
        println("Hello $name")
    }

    greetYou("Rahim")
}