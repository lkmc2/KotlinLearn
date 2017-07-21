package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-10.
 */
/**
 * 编写函数注意事项
 * 1.功能要单一
 * 2.函数名要做到顾名思义
 * 3.参数个数不要太多
 * 普通函数也叫具名函数，也就是有具体名称的函数
 * 函数的默认返回值为Unit类型，返回值带其他的类型的需要在参数的括号后加冒号并指定返回值类型
 */
fun main(args: Array<String>) { //main函数的类型(Array<String>) -> Unit
    checkArgs(args)
    val a: Int = args[0].toInt()
    val b: Int = args[1].toInt()
    println("$a + $b = ${sum(a, b)}")
    println("$a + $b = ${add(a, b)}")
    println(int2Long(a))
    sayHi("This is it")
}

fun checkArgs(args: Array<String>) { //检查传入的参数是否为两个
    if (args.size != 2) {
        printUsage()
        System.exit(0)
    }
}

fun printUsage() { //打印错误信息 () -> Unit
    println("请传入两个参数整型参数，例如1 2") //print函数的类型 (Any?) -> Unit
}

fun add(a: Int, b: Int) = a + b //简单函数表示 (Int,Int) -> Int

fun sum(a: Int, b: Int): Int { //一般函数表示 (Int,Int) -> Int
    return a + b
}

val int2Long = fun(x: Int): Long { //用常量承载匿名函数方式1 (Int) -> Long
    return x.toLong()
}

val sayHi = fun(word: String) = print("Hello,$word") //用常量承载匿名函数方式2 (String) -> Unit
