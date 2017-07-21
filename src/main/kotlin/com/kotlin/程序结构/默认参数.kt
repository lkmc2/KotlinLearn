package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
/**
 * 默认参数
 * 在声明参数时，可指定参数的默认值，
 * 若在调用该函数时不传入该参数，系统则使用默认的参数值，
 * 但是需指定其他参数的参数名（如果是最后一个参数则不用）
 * 当参数全都有默认值的时候可以不传参数
 */
fun main(args: Array<String>) {
    val array = intArrayOf(1,2,3,4)
    hello2(ints = *array, string = "Hebe")

    hello3(string = "Andy")

    hello4()
}

fun hello2(double: Double = 5.0, vararg ints: Int, string: String) { //为double指定默认值5
    ints.forEach(::println)
}

fun hello3(vararg ints: Int = intArrayOf(2, 3, 4), string: String) { //为可变参数指定默认值2,3,4
    ints.forEach(::println)
}

fun hello4(name: String = "Jack", age: Int = 12) { //为name指定默认值Jack，age指定默认值12
    println("$name : $age")
}