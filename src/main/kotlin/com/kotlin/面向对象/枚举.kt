package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 枚举
 * 1.枚举中若除了枚举值以外还有其他的方法，需要使用分号隔开
 * 2.其中默认带有的属性ordinal表示该枚举值定义的时候排列的位置
 * 3.枚举也是类的一种，可以修改构造函数，也可以添加成员
 * 4.可以提升代码的表现力，但有一定的开销
 */
enum class LogLevel { //日志打印等级
    VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT
}

class LogLevel2 protected constructor() { //此写法等价于LogLevel的写法
    companion object {
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
        val INFO = LogLevel2()
        val WARN = LogLevel2()
        val ERROR = LogLevel2()
        val ASSERT = LogLevel2()
    }
}

enum class LogLevel3(val id: Int) { //日志打印等级
    VERBOSE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4), ASSERT(5);

    fun getTag(): String {
        return "$id,$name" //此处的name对应枚举值的名字
    }

    override fun toString(): String {
        return "$name,$ordinal" //ordinal表示该枚举值定义的时候排列的位置
    }
}

class LogLevel4 protected constructor(val id: Int) { //此写法等价于LogLevel3的写法
    companion object {
        val VERBOSE = LogLevel4(0)
        val DEBUG = LogLevel4(1)
        val INFO = LogLevel4(2)
        val WARN = LogLevel4(3)
        val ERROR = LogLevel4(4)
        val ASSERT = LogLevel4(5)
    }

    fun getTag(): String {
        return "$id"
    }
}

fun main(args: Array<String>) {
    println(LogLevel3.DEBUG.getTag())
    println(LogLevel3.DEBUG.ordinal) //ordinal表示该枚举值定义的时候排列的位置

    LogLevel3.values().map(::println) //values表示列出所有枚举值

    println(LogLevel3.valueOf("ERROR")) //使用valueOf方法可以拿到枚举值的实例

    println(LogLevel4.ERROR.getTag())
}