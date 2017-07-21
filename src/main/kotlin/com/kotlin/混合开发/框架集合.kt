package com.kotlin.混合开发

/**
 * Created by Lin Change on 2017-07-18.
 */
fun main(args: Array<String>) {
    //使用java中的ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("Hello") //添加元素Hello
    arrayList.add("World") //添加元素World
    arrayList.add("Jack")//添加元素Jack

    arrayList.remove("World") //移除元素World
    arrayList.removeAt(0) //移除第0个元素

    println("arrayList遍历如下：")
    arrayList.forEach(::println) //遍历打印列表中的元素

    //Kotlin中的不可变列表（生成后不能添加或删除元素）
    val list = listOf("Hello", "World")

    //Kotlin中的不可变map（生成后不能添加或删除元素）
    val map = mapOf("one" to "Jack", "two" to "Rose")

    //Kotlin中的可变list（生成后可以添加或删除元素）
    val mutableList = mutableListOf("Hello", "World")
    mutableList.add("Everything")
    println("mutableList遍历如下：")
    mutableList.forEach(::println)

    //Kotlin中的可变map（生成后可以添加或删除元素）
    val mutableMap = mutableMapOf("three" to "Sara", "four" to "Gun")
    mutableMap.put("five", "Amy")
    println("mutableMap遍历如下：")
    mutableMap.forEach(::println)
}

object Test {
    val list = listOf(1,2,4)
}