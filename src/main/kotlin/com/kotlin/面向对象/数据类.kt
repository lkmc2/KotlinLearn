package com.kotlin.面向对象

import com.kotlin.面向对象.annotations.PoKo

/**
 * Created by Lin Change on 2017-07-14.
 */

/**
 * 数据类
 * 1.为类加上data关键词之后，该类变成数据类，
 * 会自动为属性添加getter和setter方法，以及copy、toString、hashCode、equals方法，
 * 也有对应的componentN属性，对应的是构造器里面的第N个参数
 * 2.为类重写componentN的方法之后，调用的时候可以使用（）符号带参数来表示该对象
 * 3.默认的数据类是final类型的，同时没有无参的构造方法，需加noarg和allopen插件，
 * 就可以生成适当的javaBean
 */
class Country(val id: Int, val name: String) //国家类

@PoKo
data class Country2(val id: Int, val name: String) //国家类2

class ComponentX { //该类重写了component1到component4的方法
    operator fun component1(): String {
        return "斜阳"
    }

    operator fun component2(): String {
        return "空调"
    }

    operator fun component3(): String {
        return "WIFI"
    }

    operator fun component4(): String {
        return "西瓜"
    }
}

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.id)
    println(china.name)

    val england = Country2(1, "英国")
    println(england)
    println(england.component1()) //component1相当于于第一个参数id
    println(england.component2()) //component2相当于第二个参数name

    //此处的id，name分别对应Country2类中的component1和component2
    val (id, name) = england
    println(id)
    println(name)

    val componentX = ComponentX()
    val (a,b,c,d) = componentX //用（）符号加参数承接对象的值
    println("$a $b $c $d")
}

