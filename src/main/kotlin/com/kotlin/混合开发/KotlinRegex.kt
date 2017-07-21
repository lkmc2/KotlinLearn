package com.kotlin.混合开发

/**
 * Created by Lin Change on 2017-07-18.
 */
fun main(args: Array<String>) {
    val source = "Hello,This is my phone number:010-12345678." //原文本
    val pattern = """.*(\d{3}-\d{8}).*""" //正则式

    //使用kotlin方法打印出匹配出的内容
    Regex(pattern).findAll(source).toList().flatMap(MatchResult::groupValues).forEach(::println)
}