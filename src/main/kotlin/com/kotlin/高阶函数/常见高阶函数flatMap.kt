package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 *  常见高阶函数
 *  flatMap函数：可把带区间的函数转换成元素相同但不带区间的列表
 */
fun main(args: Array<String>) {
    val list = listOf( //包含区间的列表
            1..5,
            2..4,
            100..104
    )

    //[1,2,..,5,2..4,100,101...104]将list转换成单行列表
    val flatList = list.flatMap {
        it
    }

    //[No.1,No.2,..,No.5,No.2..No.4,No.100,No.101...No.104]将list转换成单行列表2
    //flatMap所传入的返回值是iterable，需另加一层map转换成list才能迭代
    val flatList2 = list.flatMap { intRange ->
        intRange.map { intElement ->
            "No.$intElement"
        }
    }

    flatList.forEach(::println) //打印生成的列表
    flatList2.forEach(::println) //打印生成的列表2
}