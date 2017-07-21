package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
/**
 * 变长参数的长度是可变的，相当于数组，使用vararg关键词表示，
 * 在函数的参数中，若变长参数不是最后一个，
 * 在调用该函数的时候，非变长参数的参数需使用具名参数，
 * 也就是要明确指定其他参数的名称
 */
fun main(vararg args: String) {
    for (arg in args) {
        println(arg)
    }

    hello(3.0, 1, 2, 3, 4, string = "Great") //参数string需明确指定参数名

    val array = intArrayOf(6,7,8,9)
    hello(4.0, *array, string = "never") //用*号将array数组传给变长参数，变长参数只支持array，不支持list
}

fun hello(num: Double, vararg ints: Int, string: String) {
    ints.forEach(::println)
}