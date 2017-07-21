package com.kotlin.个人练习

/**
 * Created by Lin Change on 2017-07-17.
 */
fun fact(n: Int): Int {
    if (n == 0) return 1
    return n * fact(n - 1)
}

fun fact2(n: Int): Int {
    return (1..n).reduce { acc, i -> acc * i }
}

fun main(args: Array<String>) {
    println(fact(5))
    println(fact2(5))
}