package demo

fun main(args: Array<String>) {
    val a = 13
    val b = 34
    val c = 23

    if (a == 13) {
        println("a is equal to 13")
    } else {
        println("a is not 34")
    }

    if (a > b) {
        if (a > c) {
            println("a is the largest")
        } else {
            println("c is the largest")
        }
    } else {
        if (b > c) {
            println("b is the largest")
        } else {
            println("c is the largest")
        }
    }

    if (a > 0) {
        println("a is positive")
    } else if (a < 0) {
        println("a is negative")
    } else {
        println("a is zero")
    }

    if (b > 0 && b < 100) {
        println("b is in between zero to hundred")
    }

    if (c in 1..99) {
        println("c is in between zero to hundred")
    }

    val d = -23
    when {
        d > 0 -> {
            println("d is positive")
        }
        d < 0 -> {
            println("d is negative")
        }
        else -> {
            println("d is zero")
        }
    }

}