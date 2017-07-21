package com.kotlin.面向对象

import kotlin.reflect.KProperty

/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 属性代理
 * 1.类中的val和var属性都可以使用代理进行延迟加载
 * 2.类中的val属性对应的代理需要有getValue()方法
 * 3.类中的var属性对应的代理需要有getValue()和setValue()方法
 */
class Delegates {
    val helloWorld by lazy { //此处的by lazy是使用了Lazy.kt中的getValue()方法
        "HelloWorld"
    }

    val hello by X() //属性hello用X类进行代理
    var world by Y() //属性world用Y类进行代理
}

class X { //X类实现getValue方法之后，可以为val属性进行代理
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue:$thisRef -> ${property.name}")
        return "Hello"
    }
}

class Y { //Y类实现getValue和setValue()方法之后，可以为val和var属性进行代理
    private var value: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue:$thisRef -> ${property.name}")
        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("setValue:$thisRef -> ${property.name} = $value")
        this.value = value
    }
}

fun main(args: Array<String>) {
    val delegates = Delegates()
    println(delegates.helloWorld)
    println(delegates.hello)
    println(delegates.world) //此时属性world的值为空字符串

    delegates.world = "I like this world" //为属性world设置新的值
    println(delegates.world)
}