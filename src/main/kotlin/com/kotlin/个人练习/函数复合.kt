package com.kotlin.个人练习

/**
 * Created by Lin Change on 2017-07-17.
 */
val sum = { i: Int, str: String? -> if (str is String) str + i else null } //Int,String -> String
val sub = { str: String?, right: Boolean -> str is String && right } //String,Boolean -> Boolean

infix fun <P1, P2, R> Function2<P1, P2, P2>.think(function: Function2<P2, R, R>): Function3<P1, P2, R, R> { //Int,String,Boolean -> Boolean
    return fun(p1: P1, str:P2, right: R): R {
        return function.invoke(this.invoke(p1, str), right)
    }
}

fun main(args: Array<String>) {
    val result = sum think sub
    println(result(3,"haah", true))
}