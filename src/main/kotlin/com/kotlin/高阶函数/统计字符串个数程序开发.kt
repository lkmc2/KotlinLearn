package com.kotlin.高阶函数

import java.io.File

/**
 * Created by Lin Change on 2017-07-17.
 */
fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()

//    //读取build.gradle文件，变成字节数组后，提取出非空字节内容后遍历
//    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
//        val count = map[it] //用来统计当前字节个数的临时变量
//        if (count == null) map[it] = 1 //如果该字节之前未出现过，将其设置为1
//        else map[it] = count + 1 //如果该字节已出现过，在原来的基础上加1
//    }
//
//    map.forEach(::println) //迭代该map

    //读取build.gradle文件，变成字节数组后，提取出非空字节内容后遍历
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace) //本段代码与上一段效果一致
            .groupBy { it }.map { //按字节分组后生成新的列表
        it.key to it.value.count() //用map的键和值生成一对Pair存到列表中
    }.forEach(::println) //遍历打印出来
}