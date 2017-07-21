package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-09.
 */
fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
//    val name = getName() ?: return //名字为空时返回
//    println(name?.length) //name不为空时获取长度

    val value: String? = "HelloWorld"
    println(value!!.length) //确定该值不为空时使用
}
