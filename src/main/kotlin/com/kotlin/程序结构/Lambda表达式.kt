package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-10.
 */
fun sum1(a: Int, b: Int): Int { //一般函数表示
    return a + b
}

val int2Long2 = fun(x: Int): Long { //用常量承载匿名函数方式1
    return x.toLong()
}

val sum2 = { a: Int, b: Int -> a + b } //单行lambda表达式1 (Int,Int) -> Int

val printHello = { println("This is it") } //单行lambda表达式2 () -> Unit

val sum3 = { //多行lambda表达式
    arg1: Int, arg2: Int ->
    //参数
    println("$arg1 + $arg2 = ${arg1 + arg2}") //执行过程打印消息
    arg1 + arg2 //返回值
} // (Int,Int) -> Int

fun main(args: Array<String>) {
    println(sum3(2,3)) //调用函数1
    println(sum3.invoke(2,3)) //调用函数2（与调用函数1一致）

    args.forEach(::println) //遍历方法1（最简单的表达方法）

    for (x in args) { //遍历方法2
        println(x)
    }

    args.forEach { //遍历方法3
        println(it)
    }

    /**
     * 遍历方法4,（与遍历方法3一致）
     * 在forEach方法中传入lambda表达式,
     * 传入参数只有一个时默认是it，也可以不写
     */
    args.forEach({ it -> println(it) })

    /**
     * 遍历方法5
     * 当最后一个参数为lambda表达式的时候，
     * 可以将遍历方法4中的的（）括号往前移
     */
    args.forEach() { println(it) }

    args.forEach {
        if (it == "q") return //此时return的是main函数，之后的The End将不会输出
        println(it)
    }

    args.forEach A@{ //给forEach起一个标签名A
        if (it == "q") return@A //结束A标签此时return的是forEach函数本身，main函数不会中断
        println(it)
    }

    println("The End")

    /**
     * 打印匿名函数时，有N参数就是实现了FunctionN接口， N的传入的参数个数
     */
    println(int2Long2)
    println(sum3)
    println(::printUsage) //打印具名函数（就是普通函数）需要在函数名前加：：

}