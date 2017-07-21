package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
/**
 * 具名参数：在使用函数的时候，把参数名写上，
 * 参数名的顺序可交换，但只要其中一个写上参数名，其他的就必须写上
 */
fun main(args: Array<String>) {
    println(sum5(x = 4, y = 5))
    println(sum5(y = 2, x = 4))
}

fun sum5(x: Int, y: Int): Int = x + y