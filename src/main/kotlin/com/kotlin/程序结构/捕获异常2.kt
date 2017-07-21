package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
fun main(args: Array<String>) {
    //用try...catch...为一个数赋值
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }

    println(result)

    println("3 / 4 = ${add2(3, 4)}")
}

fun add2(x: Int, y: Int): Int {
    return try {
        x / y
    } catch (e: Exception) {
        0
    } finally {
        println("end")
    }
}
