package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * 高阶函数
 * 1.filter函数：用来提取（过滤）列表里面符合条件的元素形成新的列表，filter中表达式的值代表希望提取的内容
 * 2.filterIndexed函数：与filter原理相同，可以取到列表的下标和值
 * 3.takeWhile函数：连续提取出列表中值满足条件的元素，一旦碰到不满足条件的元素，提取终止
 */
fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,5,6,7,8)

    println("提取出列表中值为奇数的元素")
    println(list.filter { it % 2 == 1 })

    println("提取中列表中下标为奇数的元素")
    println(list.filterIndexed { index, i -> index % 2 == 1 })

    println("提取出列表中值为奇数的元素，一旦碰到偶数，提取终止")
    println(list.takeWhile { it % 2 == 1 })
}