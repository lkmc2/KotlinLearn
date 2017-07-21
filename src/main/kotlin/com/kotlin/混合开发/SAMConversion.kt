package com.kotlin.混合开发

/**
 * Created by Lin Change on 2017-07-18.
 */
/**
 * kotlin与java互操作（SAM 转换）
 * 1.SAM 是Single Abstract Method是缩写
 * 2.SAM转换的条件：Java的接口，只有一个接口当参数的方法，可以使用lambda当参数
 * 3.对于实现了kotlin实现的java接口，在java函数中定义该参数后，kotlin引用时可以用lambda表达式使用
 * 4.由于java与kotlin表达式并不兼容，所以在每次添加lambda表达式是都不出同一个对象
 */
fun main(args: Array<String>) {
    val samInJava = SAMInJava() //实例化java中的类

    //lambda调用方法1：使用java中的带kotlin已支持的接口参数的方法，可以直接使用lambda表达式当参数
    samInJava.addTask {
        println("Hello")
    }

    val lambda = {
        println("World")
    }

    //lambda调用方法2
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)

    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)

    val samInKotlin = SAMInKotlin() //实例化kotlin中的类
    //以lambda表达式使用kotlin中的方法
    samInKotlin.addTask {
        println("haha")
    }
}