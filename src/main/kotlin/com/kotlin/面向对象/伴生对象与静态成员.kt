package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-13.
 */
/**
 * companion object关键字表示伴生对象
 * 1.每个类可以对应一个伴生对象
 * 2.伴生对象的成员全局独一份
 * 3.伴生对象的成员类似java的静态成员
 * 4.若是在java代码中要调用伴生对象中的方法，需先访问Companion
 * 5.若是给伴生对象的属性或者方法加上@JvmStatic注解，可以在java文件中不访问Companion，直接使用
 */
class Latitude private constructor(val value: Double){ //采用私有构造器
    companion object { //伴生对象
        @JvmStatic //使用该注解后，可在java类中不访问Companion，直接使用伴生对象里面的方法
        fun ofDouble(double: Double): Latitude { //设置纬度
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude): Latitude { //拷贝纬度
            return Latitude(latitude.value)
        }

        val TAG: String = "Latitude" //相对于静态属性
    }
}

fun main(args: Array<String>) {
    val latitude = Latitude.ofDouble(3.0) //设置纬度
    val latitude2 = Latitude.ofLatitude(latitude) //拷贝纬度

    println(latitude)
    println(latitude2)
    println(Latitude.TAG)
}