package demo

fun main(args: Array<String>) {
    fun isPrime (n : Int) : Boolean {
        if (n == 1) {
            return false
        }
        var i = 2
        while (i * i <= n) {
            if (n % i == 0) {
                return false
            }
            i++
        }
        return true
    }

    val num = 2
    println("Is $num a prime? ${isPrime(num)}")
}