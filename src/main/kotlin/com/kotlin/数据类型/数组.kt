package com.kotlin.数据类型

/**
 * Created by Lin Change on 2017-07-10.
 */
val arrayOfInt: IntArray = intArrayOf(1,3,5,7) //整型数组
val arrayOfChar: CharArray = charArrayOf('H','e','l','l','o') //字符数组
val arrayOfString: Array<String> = arrayOf("我","不是","简单的人") //字符串数组
val arrayOfPerson: Array<Person> = arrayOf(Girl("王菲",22,"滑板"), Boy("田田",23,"射击")) //对象数组

fun main(args: Array<String>) {
    println(arrayOfInt.size) //打印出数组的大小

    for (i in arrayOfInt) { //遍历数组
        println(i)
    }

    println(arrayOfPerson[0]) //打印数组的第一个对象
    arrayOfPerson[1] = Girl("天香",33,"拳击") //修改数组的内容

    println(arrayOfChar.joinToString("")) //将数组转换成字符串

    println(arrayOfInt.slice(1..2)) //切片，获取数组中某个区间的元素
}


