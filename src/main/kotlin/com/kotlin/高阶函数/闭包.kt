package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-17.
 */
/**
* 闭包
* 1.闭包指的是函数的运行环境
* 2.闭包可以持有函数的运行环境
* 3.函数内部可以定义函数
* 4.函数内部也可以定义类
* 5.在函数中返回一个函数，被返回的函数可以调用主函数的属性
*/
val string = "HelloWorld"

fun makeFun(): () -> Unit { //返回值为一个无参无返回值的函数
    var count = 0
    return fun() { //返回一个匿名函数
        println(++count)
    }
}

fun fibnoacci(): () -> Long { //返回值为一个无参返回值为Long类型的函数
    var first = 0L
    var second = 1L
    return fun(): Long { //返回一个匿名函数
        val result = second
        second += first
        first = second - first
        return result
    }
}

fun fibnoacci2(): Iterable<Long> { //返回值为一个迭代器
    var first = 0L
    var second = 1L
    return Iterable { //匿名对象
        object : LongIterator() { //匿名对象
            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }

            override fun hasNext(): Boolean = true
        }
    }
}

fun main(args: Array<String>) {
    val x = makeFun()
    println("makeFun()调用：")
    x()
    x()
    x()
    x()
    x()

    val y = fibnoacci()
    println("fibnoacci()调用：")
    println(y())
    println(y())
    println(y())
    println(y())
    println(y())
    println(y())

    println("fibnoacci2()调用：")
    for (i in fibnoacci2()) {
        if (i > 100) break
        println(i)
    }

    println("add()调用：")
    val add5 = add(5)
    println(add5(2)) //5+2

    println("add2()调用：")
    val add7 = add2(7)
    println(add7(3)) //7+3
}

fun add(x: Int) = fun(y: Int) = x + y //相加方法

fun add2(x: Int): (Int) -> Int { //此方法与add方法完全一致，是完整版
    return fun(y: Int): Int {
        return x + y
    }
}