package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
/**
 * when表达式中可实现Java中的switch效果，
 * 并可支持更多的表达式，也可实现if...else...的效果
 * 一旦有一个条件是符合的，便不再执行吓一条
 */
fun main(args: Array<String>) {
    val x = 5
    when (x) {
        is Int -> println("Hello $x")
        in 1..100 -> println("$x is in 1..100")
        !in 1..100 -> println("$x in not in 1..100")
        args[0].toInt() -> println("x == args[0]")
    }

    val mode = when {
        args.isNotEmpty() && args[0] == "1" -> 1
        else -> 0
    }
}