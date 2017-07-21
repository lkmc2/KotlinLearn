package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 拓展方法
 * 1.拓展方法可以在直接不改变原类的的基础上，给该类添加原本没有的方法
 * 2.拓展属性可以给类添加原本没有的属性，但由于没有filed幕后字段，不能直接使用=赋值，
 * 只能使用getter和setter，而filed不起效，所以setter没啥用
 */
fun String.multiply(count: Int): String { //拓展方法
    val stringBuilder = StringBuilder()
    for (i in 0 until count) {
        stringBuilder.append(this) //此处的this代表字符串本身
    }
    return stringBuilder.toString()
}

operator fun String.times(count: Int): String { //运算符重载的拓展方法，可用*号进行调用
    val stringBuilder = StringBuilder()
    for (i in 0 until count) {
        stringBuilder.append(this) //此处的this代表字符串本身
    }
    return stringBuilder.toString()
}

val String.specName: String //String的拓展属性
    get() = "$this spec"

fun main(args: Array<String>) {
    //打印10个连续不换行的abc字符串
    println("abc".multiply(10)) //拓展方法
    println("abc" * 10) //运算符重载的拓展方法
    println("never".specName) //拓展属性
}