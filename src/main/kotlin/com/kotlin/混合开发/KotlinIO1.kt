package com.kotlin.混合开发

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * Created by Lin Change on 2017-07-18.
 */
fun main(args: Array<String>) {
    val file = File("build.gradle") //新建文件读取build.gradle的内容
    //把文件内容读取进缓冲读取器
    val bufferedReader = BufferedReader(FileReader(file))
    var line: String

    while (true) {
        //当有内容时读取一行数据，否则退出循环
        line = bufferedReader.readLine() ?: break
        println(line) //打印一行数据
    }
    bufferedReader.close() //关闭缓冲读取器
}