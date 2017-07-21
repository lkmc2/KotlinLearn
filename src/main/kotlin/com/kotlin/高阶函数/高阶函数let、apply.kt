package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * 高阶函数
 * 1.let函数：可以以参数对象的形式调用参数对象里的属性或者方法（适用于对象）
 * 2.apply函数：可以直接调用对象中的属性或者方法，不需要参数对象（适用于对象）
 */
data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name 正在工作中")
    }
}

fun findPerson(): Person? {
    return null
}

fun main(args: Array<String>) {
    println("打印可为空的person属性信息方式一：")
    val person = findPerson()
    println(person?.name) //输出为null
    println(person?.age) //输出为null

    println("\n打印可为空的person属性信息方式二：")
    findPerson()?.let { (name, age) ->
        println(name)
        println(age)
    }

    println("\n调用对象方法的方式一：")
    findPerson()?.work()

    println("\n调用对象方法的方式二：")
    findPerson()?.let(Person::work)

    println("\n调用对象方法的方式三：")
    findPerson()?.let { person ->
        person.work()
        println(person.name)
        println(person.age)
    }

    println("\n打印直接构造的对象的信息：")
    Person("Jack", 23).let {
        println(it.name)
        println(it.age)
        it.work()
    }

    println("\n使用apply直接调用属性或者方法一：")
    findPerson()?.apply {
        println(name)
        println(age)
        work()
    }

    println("\n使用apply直接调用属性或者方法二：")
    Person("Rose", 21).apply {
        println(name)
        println(age)
        work()
    }
}