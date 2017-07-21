package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-10.
 */
/**
 * 类中的函数参数不能用var和val来修饰
 * 类的构造方法中，加var或val的为属性，不加的为参数
 */
class Animal(var name: String, var age: Int, hobby: String) {
    fun sing(songName: String) {
        println("动物正在唱歌:$songName")
    }

    fun dance(danceName: String) {
        println("动物正在跳舞:$danceName")
    }
}

fun main(args: Array<String>) {
    val panda = Animal("熊猫",3,"吃竹子")
    panda.sing("我不愿让你一个人")
    panda.dance("舞娘")
}