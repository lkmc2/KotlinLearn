package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
class MyIterator(val iterator: Iterator<Int>){ //自定义迭代器
    operator fun next(): Int { //下一个
        return iterator.next()
    }

    operator fun hasNext(): Boolean { //判断是否有下一个
        return iterator.hasNext()
    }
}

class MyIntList { //自定义列表
    private val list = ArrayList<Int>()

    fun add(int: Int) { //添加到列表
        list.add(int)
    }

    fun remove(int: Int) { //从列表中移除
        list.remove(int)
    }

    operator fun iterator(): MyIterator { //迭代列表
        return MyIterator(list.iterator())
    }
}

fun main(args: Array<String>) {
    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)

    for (i in list) {
        println(i)
    }
}