package com.kotlin.领域特定语言

/**
 * Created by Lin Change on 2017-07-17.
 */
/**
 * 此处的参数block表示一个（参数为Tag的拓展函数、无返回值的）函数
 */
fun html(block: Tag.() -> Unit): Tag { //简化html标签的函数
//    return Tag("html").apply { block(this) } //此返回值可直接使用Tag标签内的环境
    return Tag("html").apply(block) //此返回值可直接使用Tag标签内的环境（效果与上一句注释掉的相同）
}

fun Tag.head(block: Head.() -> Unit) { //简化head标签的函数
    return this@head + Head().apply(block) //此返回值可直接使用Head标签内的环境
}

fun Tag.body(block: Body.() -> Unit) { //简化body标签的函数
    return this@body +  Body().apply(block) //此返回值可直接使用Body标签内的环境
}

class StringNode(val content: String): Node { //简化标签中添加文字的函数
    override fun render() = content
}

class Head: Tag("head")

class Body: Tag("body") {
    var id by MapDelegate(properties)
    var `class` by MapDelegate(properties)
}

