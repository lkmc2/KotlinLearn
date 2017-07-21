package com.kotlin.高阶函数

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * 高阶函数
 * 1.with函数：该函数需要传入一个对象，之后可以在该函数中直接使用传入的对象的属性或方法，
 * 不需要 类名.属性 的方式就可以使用
 * 2.use函数：该函数只能被实现了Closeable的对象使用，程序结束的时候会自动调用close方法，适合文件对象
 */
fun main(args: Array<String>) {
    //读取文件方式一
    val br = BufferedReader(FileReader("hello.txt")) //打开文件读取
    with(br) { //对br中的属性和方法直接进行操作
        var line: String?

        while (true) {
            line = readLine() ?: break //读取一行数据，若为空则退出循环
            println(line) //打印读取的数据
        }
        close() //关闭文件读取
    }

    //读取文件方式二
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?

        while (true) {
            line = it.readLine() ?: break //读取一行数据，若为空则退出循环
            println(line) //打印读取的数据
        }
    }

    //读取文件方式三
    println(BufferedReader(FileReader("hello.txt")).readText()) //最简单的读取文件的方法
}