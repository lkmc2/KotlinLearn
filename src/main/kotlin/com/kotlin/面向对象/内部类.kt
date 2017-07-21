package com.kotlin.面向对象


/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 内部类
 * 1.kotlin默认的内部类是静态内部类，不能持有外部类的状态（属性、方法等）
 * 2.给内部类加上inner关键词之后，就会变成非静态内部类，可以访问外部类的属性和方法
 * 3.非静态内部类想访问外部类的属性，可以使用 this@外部类名.外部类 的形式访问
 * 4.非静态内部类可以访问到外部静态内部类的方法和属性，静态内部类访问不到外部所有的属性和方法
 */
class Outer { //外部类
    private val text: String = "I like this world"

    class Inner { //静态内部类
        private val text: String = "NEW"

        fun show() {
//            println(this@Outer.text) //此处访问不到
            println(this.text) //访问Inner中的text
        }
    }

    inner class Inner2 { //非静态内部类
        private val text: String = "Great"

        fun show2() {
            println(this.text) //访问Inner2中的text
            println(this@Outer.text) //此处的写法相当于java中的Outer.this.text
        }
    }
}

fun main(args: Array<String>) {
    val inner = Outer.Inner() //静态内部类
    val inner2 = Outer().Inner2() //非静态内部类

    inner.show()
    inner2.show2()
}