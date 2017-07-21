package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-09.
 */
fun main(args: Array<String>) {
//    val parent: Parent = Child()
    val parent: Parent = Parent()
//    val child: Child? = parent as Child //进行类型转换，如不成功则抛出异常
    val child: Child? = parent as? Child //进行类型转换，如不成功返回null
    println(child)

    if (parent is Child) {
        println(parent.name)
    }

    val string: String? = "Hello"
    if (string is String) { //智能转换1
        println(string.length)
    }
    if (string != null) { //智能转换2
        println(string.length)
    }
    println(string!!.length) //告诉编译器当前已确定字符串不为空
}
