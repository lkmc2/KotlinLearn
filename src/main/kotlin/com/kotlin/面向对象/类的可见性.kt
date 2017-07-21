package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-13.
 */
/**
 * 访问修饰符
 * 1.类的访问修饰符有private、protected、internal、public，可见性逐步加大
 * 2.private仅本类可见
 * 3.protected本类及其子类
 * 4.internal模块内部可见
 * 5.public全局可见
 *
 * 注意点
 * 1.类的属性默认是public
 */
class House //房子类

class Flower //花类

class Courtyard { //院子类
    public val house: House = House() //房子
    private val flower: Flower = Flower() //花
}

class ForbiddenCity { //紫禁城类
    protected val houses = arrayOf(House(), House()) //多个房子
    internal val flowers = arrayOf(Flower(), Flower()) //多朵花
}

fun main(args: Array<String>) {
    val courtyard = Courtyard()
    val forbiddenCity = ForbiddenCity()

    println(courtyard.house)
    //private关键词修饰，该属性访问不到
//    println(courtyard.flower)
    //protected修饰的属性只有该类内部和其子类内部能访问到，直接访问不到
//    println(forbiddenCity.houses)
    println(forbiddenCity.flowers)
}