package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
fun main(args: Array<String>) {
    for (arg in args) { //普通for语句
        println(arg)
    }

    for ((index, value) in args.withIndex()) { //带下标和值的for语句1
        println("$index -> $value")
    }

    for (indexValue in args.withIndex()) { //带下标和值的for语句2
        println("${indexValue.index} -> ${indexValue.value}")
    }
}