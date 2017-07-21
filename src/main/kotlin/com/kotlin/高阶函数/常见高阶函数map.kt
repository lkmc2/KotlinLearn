package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * 常见高阶函数
 * map函数：可遍历数组中的元素，做一定操作之后返回一个列表
 */
fun main(args: Array<String>) {
    val list = listOf(1, 3, 4, 5, 10, 8, 2) //旧的列表

    val newList = ArrayList<Int>() //新的列表

    list.forEach {
        //生成新列表方式1
        val newElement = it * 2 + 3 //生成一个新元素（it代码本次循环中列表中的值）
        newList.add(newElement) //将元素添加到新列表中
    }

    val newList2 = list.map {
        //生成新列表方式2（结果与生成新列表方式1一致）
        it * 2 + 3
    }

    val newList3 = list.map(Int::toDouble) //将list中的数转换成double型的

    println("打印newList")
    newList.forEach(::println) //打印新列表中的元素
    println("打印newList2")
    newList2.forEach(::println) //打印新列表2中的元素
    println("打印newList3")
    newList3.forEach(::println) //打印新列表3中的元素

    //用map也可以实现遍历打印的效果，但其中比forEach方法多了一个数组，影响性能
    newList3.map(::println)
}