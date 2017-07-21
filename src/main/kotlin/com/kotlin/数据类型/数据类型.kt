package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-06.
 */
val aBoolean: Boolean = true //布尔值为真
val anotherBoolean: Boolean = false //布尔值为假

val aInt: Int = 8 //整型
val anotherInt: Int = 0xFF //整型
val binInt: Int = 0b00000011 //二进制
val maxInt: Int = Int.MAX_VALUE //最大整型值
val minInt: Int = Int.MIN_VALUE //最小整型值

val aLong: Long = 5641564851251941965 //长整型
val anotherLong: Long = 123 //长整型
val maxLong: Long = Long.MAX_VALUE //最大长整型值
val minLong: Long = Long.MIN_VALUE //最小长整型值

val aFloat: Float = 2.0F //单精度浮点型
val anotherFloat: Float = 1E3f //单精度浮点型
val maxFloat: Float = Float.MAX_VALUE //最大单精度浮点型值
val minFloat: Float = Float.MIN_VALUE //最小单精度浮点型值
val minRealFloat: Float = -Float.MAX_VALUE//真正最小单精度浮点型值

val aDouble: Double = 2.0 //双精度浮点型
val anotherDouble: Double = 3.1415926 //双精度浮点型
val maxDouble: Double = Double.MAX_VALUE //最大双精度浮点型值
val minDouble: Double = Double.MIN_VALUE //最小双精度浮点型值
val minRealDouble: Double = -Double.MAX_VALUE//真正最小双精度浮点型值

val aShort: Short = 127 //短整型
val maxShort: Short = Short.MAX_VALUE //最大短整型
val minShort: Short = Short.MIN_VALUE //最小短整型

val maxByte: Byte = Byte.MAX_VALUE //最大字节
val minByte: Byte = Byte.MIN_VALUE //最小字节

val aChar: Char = '0' //字符
val bChar: Char = '中' //字符
val cChar: Char = '\u000f' //Unicode字符

fun main(args: Array<String>) {
    println(minInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(maxInt)
    println(-Math.pow(2.0, 31.0))
    println()

    println(maxLong)
    println(Math.pow(2.0, 63.0) - 1)
    println(minLong)
    println(-Math.pow(2.0, 63.0))
    println()

    println(aFloat)
    println(anotherFloat)
    println(maxFloat)
    println(minFloat)
    println(minRealFloat)
    println()

    println(aDouble)
    println(anotherDouble)
    println(maxDouble)
    println(minDouble)
    println(minRealDouble)
    println()

    println(aShort)
    println(maxShort)
    println(minShort)
    println()

    println(maxByte)
    println(minByte)
    println()

    println(aChar)
    println(bChar)
    println(cChar)

    println(0.0F / 0.0F) //NaN, not a num
}
