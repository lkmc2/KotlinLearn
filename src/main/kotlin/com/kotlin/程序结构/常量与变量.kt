package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-10.
 */
/**
 * 运行时常量是编译时并不知道其值，真正运行的时候才获取
 * 编译期常量是编译时候就知道其值的常量
 * kotlin中val并不是编译期常量，可通过反射的方式修改值，要将其转成编译期常量需要加上const关键词，可提高运行效率
 */
const val FINAL_HELLO_WORLD: String = "HelloWorld" //编译期常量
var helloWorld: String = FINAL_HELLO_WORLD //变量

val FINAL_CHINA = "中国" //常量

fun main(args: Array<String>) {
    helloWorld = "haha" //给变量重新赋值

    println(FINAL_CHINA) //打印常量
}