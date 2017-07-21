package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 密封类
 * 1.密封类用sealed关键词表示
 * 2.密封类的子类只能定义在密封类的内部或同一个文件中，因为其构造方法为私有的
 * 3.密封类相比于普通的open类，可以不被此文件外被继承，有效保护代码
 * 4.与枚举的区别：密封类适用于子类可数的情况，枚举适用于实例可数的情况
 */
sealed class PlayerCmd { //演奏控制类（密封类）
    val playerName: String = "Player"

    class Player(val url: String, val position: Long = 0): PlayerCmd() { //演奏类
        fun showUrl() {
            println("$url, $position")
        }
    }

    class Seek(val position: Long): PlayerCmd() //快进

    object Pause: PlayerCmd() //暂停（无需进行重载的类适合用单例object）
}

object Resume: PlayerCmd() //继续（密封类的子类也可以定义在密封类的外部，但要在同一个文件中）

object Stop: PlayerCmd() //停止

enum class PlayerState { //枚举适合表现简单的状态
    IDLE, PAUSE, PLAYING, STOP
}

fun main(args: Array<String>) {
    PlayerCmd.Player("苍茫的天涯").showUrl()
    println(Resume.playerName)
}