package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-10.
 */
/**
 * 属性：类范围内的常量或变量
 * 方法：类范围内的函数
 * kotlin自动为类的变量设置getter和setter，类中成员变量的默认访问权限是public
 * 属性初始化
 * 1.属性的初始化尽量在构造方法中完成
 * 2.无法在构造方法中初始化，尝试降级为局部变量
 * 3.var用lateinit延迟初始化，val用by lazy
 * 4.可空类型谨慎用null直接初始化
 */
class A {
    var b = 0

    var c = 0
        get() {
            println("尝试获取变量b的值")
            return field //field是变量c的默认值，getter和setter中才能访问到
        }
        protected set //单独给setter设置访问权限
//        protected set(value) {
//            println("尝试设置变量b的值")
//            field = value
//        }

    /*
    类中的变量必须马上赋值，一开始不想指定值的话，
    需加lateinit关键字，但加了之后若是在初始化之前就使用会报错的，
    lateinit只能用在var上
     */
    lateinit var d: String

    val e: X by lazy { //val常量延迟加载
        println("init X")
        X()
    }
}

class X

fun main(args: Array<String>) {
    val a = A()
    println(a.e)

    a.d = "haha"
    println(a.d)
}
