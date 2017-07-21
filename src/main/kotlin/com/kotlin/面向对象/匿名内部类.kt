package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-14.
 */
/**
 * 匿名内部类
 * 1.kotlin中的匿名内部类可以用 object：接口名或类名 的形式实现
 * 2.匿名内部类可以继承一个类，实现多个接口
 * 3.匿名内部类并不是真的没有名字，在编译的时候会有其对应的id，可通过反射获取
 */
interface OnClickListener { //点击监听器接口
    fun onClick() //点击事件
}

class View { //视图类
    var onClickListener: OnClickListener? = null
}

open class Appear

fun main(args: Array<String>) {
    val view = View() //新建一个视图

    view.onClickListener = object : OnClickListener { //此处的object就是匿名内部类
        override fun onClick() { //点击事件
            println("click one")
        }
    }

    (view.onClickListener as OnClickListener).onClick() //as关键词表示类型转换

    //匿名内部类可以继承一个类，实现多个接口
    view.onClickListener = object : Appear(), OnClickListener {
        override fun onClick() { //点击事件
            println("click two")
        }
    }

    (view.onClickListener as OnClickListener).onClick() //进行点击
}