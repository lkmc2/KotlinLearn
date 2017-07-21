package com.kotlin.混合开发

import java.io.File

/**
 * Created by Lin Change on 2017-07-18.
 */
fun main(args: Array<String>) {
    //最简单打印文件内容的方法，readLines（）方法可读取文件内容
    File("build.gradle").readLines().forEach(::println)
}