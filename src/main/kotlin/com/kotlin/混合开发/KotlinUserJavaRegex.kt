package com.kotlin.混合开发

import java.util.regex.Pattern

/**
 * Created by Lin Change on 2017-07-18.
 */
fun main(args: Array<String>) {
    val source = "Hello,This is my phone number:010-12345678." //原文本
    //正则式，在（三位数-八位数）的格式前后可以有任意文本
    val pattern = """.*(\d{3}-\d{8}).*"""
    //用正则式匹配文本获取匹配器
    val matcher = Pattern.compile(pattern).matcher(source)

    while (matcher.find()) { //匹配器进行匹配
        println(matcher.group()) //打印元文本信息
        println(matcher.group(1)) //打印匹配到的信息
    }
}