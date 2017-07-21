package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-10.
 */
val range:IntRange = 0..1024 //范围0到1024
val range_exclusive: IntRange = 0 until 1024 //范围0到1023

val emptyRange: IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty()) //判断区间是否为空
    println(range.contains(50)) //判断50是否在该区间
    println(50 in range) //判断50是否在该区间，效果与range.contains(50)一致

    for (i in range_exclusive) {
        print("$i,")
    }
}
