package com.kotlin.混合开发

/**
 * Created by Lin Change on 2017-07-18.
 */
/**
 * kotlin本身不支持将只有runnable接口当参数的方法直接以lambda方式使用，
 * 但使用typealias关键词给Runnable起别名之后（相当于() -> Unit就是Runnable），
 * 就可以以lambda方式使用
 */
typealias Runnable = () -> Unit

class SAMInKotlin {
    fun addTask(runnable: Runnable) {

    }
}