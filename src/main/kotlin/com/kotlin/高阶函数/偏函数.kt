package com.kotlin.高阶函数

import java.io.OutputStream
import java.nio.charset.Charset

/**
 * Created by Lin Change on 2017-07-17.
 */
/**
 * 偏函数
 * 1.偏函数是在科理化的基础上得来
 * 2.原函数传入部分参数后得到的新函数
 */
fun log3(tag: String, target: OutputStream, message: Any?) { //打印日志
    target.write("[$tag] $message\n".toByteArray()) //将日志信息写入输出流
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried3() //将科理化抽象成拓展函数
        = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

fun main(args: Array<String>) {
    //先科理化一部分参数获得偏函数
    val consoleLogWithTag = (::log3.curried3())("One")(System.out)
    consoleLogWithTag("HelloWorld") //调用偏函数
    consoleLogWithTag("I like this world")

    val bytes = "Everything is nothing.".toByteArray(charset("GBK")) //获取gbk编码的字节
    val bgkText = makeStringFromGbkBytes(bytes) //调用偏函数
    println(bgkText)
}

val makeString = fun(byteArray: ByteArray, charset: Charset): String { //生成新字符串
    return String(byteArray, charset)
}

/**
 * 拓展方法，第一个参数p2表示的是Charset，之后fun传入的p1表示的是byteArray，
 * 最后调用该函数的构造方法
 */
fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2) = fun(p1: P1) = this(p1, p2)

//由函数makeString演变出来的偏函数（设置好charset的值为Gbk）
val makeStringFromGbkBytes = makeString.partial2(charset("Gbk"))