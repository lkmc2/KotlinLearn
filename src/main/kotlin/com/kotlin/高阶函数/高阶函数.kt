package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * 高阶函数
 * 1.高阶函数的用法是把函数当作参数或者返回值
 * 2.直接引用包级函数在函数前面加两个冒号，类似::println
 * 3.引用成员函数（类里面定义的函数）需以 类名::函数名 的形式
 */
fun main(args: Array<String>) {
    //直接引用包级函数（包级函数是直接定义在文件在外面，不定义在类里面的函数）
    args.forEach(::println)

    val doSomething = Panda::eat //通过限定名Panda加双冒号获取eat方法的引用

    args.filter(String::isNotEmpty) //过滤空字符串

    val pdfPrint = PdfPrint()
    /*
    foreach只需要一个参数，若直接调用PdfPrint::println，
    会传入PdfPrint这个实例和any这两个参数，所以需要先构造一个PdfPrint实例，再调用println方法
     */
    args.forEach(pdfPrint::println)
}

class PdfPrint {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Panda {
    fun eat() {
        println("熊猫正在吃东西")
    }
}