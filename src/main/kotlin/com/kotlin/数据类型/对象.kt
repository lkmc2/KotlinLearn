package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-09.
 */
class Girl(name: String, age: Int, hobby: String): com.kotlin.数据类型.Person(name, age, hobby) //继承自父类的对象应使用父类的构造器
class Boy(name: String, age: Int, hobby: String): com.kotlin.数据类型.Person(name, age, hobby)

open class Person(var name: String, var age: Int, var hobby: String) { //抽象类
    init {
        println("新建了一个${this.javaClass.simpleName}对象,名字:$name,年龄:$age,兴趣:$hobby")
    }
}

fun main(args: Array<String>) {
    val girl: com.kotlin.数据类型.Girl = com.kotlin.数据类型.Girl("王馨", 18, "网球")
    val boy: com.kotlin.数据类型.Boy = com.kotlin.数据类型.Boy("蓝源", 22, "保龄球")
}

