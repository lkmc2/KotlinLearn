package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
fun main(args: Array<String>) {
    try {
        val x = args[0].toInt()
        val y = args[1].toInt()
        println("$x + $y = ${sum4(x, y)}")
    } catch(e: NumberFormatException) {
        println("您确定传入的是整数吗？")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("您确定传入的是两个整数吗？")
    } catch (e: Exception) {
        println("出现了未知异常，${e.message}")
    } finally {
        println("谢谢使用")
    }
}

fun sum4(x: Int, y: Int): Int = x + y