package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
fun main(args: Array<String>) {
    var x = 5
    while (x > 0) { //while循环
        println(x)
        x--
    }

    do { //do...while循环
        println(x)
        x--
    } while (x > 0)
}