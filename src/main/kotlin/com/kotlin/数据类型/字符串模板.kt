package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-09.
 */
val string: String = "HelloWorld" //字符串对象
val fromChars: String = String(charArrayOf('H','e','l','l','o','W','o','r','l','d')) //由字符组成的字符串对象

fun main(args: Array<String>) {
    println(com.kotlin.数据类型.string == com.kotlin.数据类型.fromChars) //相当于equals方法，比较其内容
    println(com.kotlin.数据类型.string === com.kotlin.数据类型.fromChars) //比较是不是同一个对象

    val arg1: Int = 2
    val arg2: Int = 8
    println("$arg1 + $arg2 = ${arg1 + arg2}") //字符串模板

    //Hello "Jack"
    val sayHello: String = "Hello \"Jack\""
    println(sayHello) //输出转义字符

    //$salary
    println("\$salary") //输出转义字符

    //原生字符串
    val rawString: String = """
       You never like the world
       I just not so happy
    """
    println(rawString)
    println(rawString.length) //打印原生字符串的长度
}
