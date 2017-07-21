package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
class Book {
    infix fun on(any: Any): Boolean { //infix表示中缀表达式，定义了on表达关键字，原本是没有的
        return false
    }
}

class Desk

fun main(args: Array<String>) {
    if (Book() on Desk()) { //dsl中常用，自定义运算符on

    }
}