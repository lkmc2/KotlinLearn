package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-12.
 */
/**
 * 1.在类的构造方法中，如不用val或者var修饰参数，
 * 该参数不为属性，只能被类内部的属性访问到，方法内访问不到
 */
interface Driver { //驾驶接口
    fun drive()
}

interface Writer { //写作接口
    fun write()
}

//资深经理，实现了驾驶和写作的接口，并带有driver和writer两个属性
class SeniorManager(val driver: Driver, val writer: Writer): Driver by driver, Writer {
    //将Driver接口使用by关键字交由传入的属性driver代理之后，会自动调用driver中的driver()方法，以下三行代码可省略
//    override fun drive() {
//        driver.drive()
//    }

    override fun write() {
        writer.write()
    }
}

class CarDriver: Driver { //小车司机，实现了驾驶接口
    override fun drive() {
        println("正在驾驶")
    }
}

class PPTWriter : Writer { //ppt制作人，实现了写作接口
    override fun write() {
        println("正在制作ppt")
    }
}

class Manager: Driver, Writer { //经理，实现了驾驶和写作的接口
    override fun drive() {

    }

    override fun write() {

    }
}

fun main(args: Array<String>) {
    val driver = CarDriver() //新建司机
    val writer = PPTWriter() //新建ppt制作者
    val seniorManager = SeniorManager(driver, writer) //新建资深经理

    seniorManager.drive() //开始驾驶
    seniorManager.write() //开始写作
}