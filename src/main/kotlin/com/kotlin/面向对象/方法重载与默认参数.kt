package com.kotlin.面向对象

import java.util.ArrayList

/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 方法重载
 * 1.方法重载只与参数类型有关系
 * 2.返回值类型不同不能当成一个新的方法重载
 * 3.加上@JvmOverloads注解之后，可以在java文件中使用默认参数的重载
 */
class Overloads {
    fun a(): Int { //a方法
        return 0
    }

//    @JvmOverloads
    fun a(x: Int = 0): Int { //a方法的重载
        return x
    }
}

fun main(args: Array<String>) {
    val integerList = ArrayList<Int>()
    integerList.add(13)
    integerList.add(2)
    integerList.add(3)
    integerList.add(23)
    integerList.add(24)
    integerList.add(55)
    integerList.add(66)
    println(integerList)

    integerList.removeAt(1) //removeAt(index)是参照下标进行移除的
    integerList.remove(66) //remove(object)是参照对象进行移除的
    println(integerList)
}