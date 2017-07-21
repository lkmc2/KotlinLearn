package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-13.
 */
/**
 * 父类方法、属性需要open关键字才可以被重写
 */
interface F {
    fun x(): Int = 2
}

interface G {
    fun x(): Int = 1
}

interface H {
    fun x(): Int = 0
}

class I(var y: Int = 0): F, G, H {
    override fun x(): Int {
        if (y > 0) {
            println("call x(): Int int I")
            return y
        } else if (y < -200) {
            println("call x(): Int int F")
            return super<F>.x()
        } else if (y < -100) {
            println("call x(): Int int G")
            return super<G>.x()
        } else {
            println("call x(): Int int H")
            return super<H>.x()
        }
    }
}

fun main(args: Array<String>) {
    println(I(3).x())
    println(I(-10).x())
    println(I(-120).x())
    println(I(-10000).x())
}