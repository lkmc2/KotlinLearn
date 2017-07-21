package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * reduce函数：累加函数，第一个参数是用来叠加的返回值，第二个参数是本次循环中列表的值
 */
fun factorial(n: Int): Int { //求阶乘
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)
    //1到5求和
    println(list.reduce { acc, i -> acc + i }) //acc是累加的返回值，i是当前遍历列表中的值

    println(factorial(5)) //求5的阶乘
}