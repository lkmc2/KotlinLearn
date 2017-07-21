package com.kotlin.高阶函数

import java.io.OutputStream

/**
 * Created by Lin Change on 2017-07-17.
 */
/**
 * 科理化
 * 科理化就是把多元函数变成一元函数调用链
 */
fun log(tag: String, target: OutputStream, message: Any?) { //打印日志
    target.write("[$tag] $message\n".toByteArray()) //将日志信息写入输出流
}

fun log2(tag: String) //打印日志2（分拆参数，科理化）
    = fun(target: OutputStream)
    = fun(message: Any?)
    = target.write("[$tag] $message\n".toByteArray()) //将日志信息写入输出流

fun main(args: Array<String>) {
    println("普通调用输出")
    log("First", System.out, "HelloWorld")

    println("科理化调用输出")
    log2("Second")(System.out)("It's a good time")

    println("科理化调用输出2")
    ::log.curried()("Second")(System.out)("It's a good time") //双冒号::表示获取该函数的引用
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried() //将科理化抽象成拓展函数
        = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)