package com.kotlin.个人练习

import java.io.File

/**
 * Created by Lin Change on 2017-07-17.
 */
fun main(args: Array<String>) {
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy { it }.map {
        it.key to it.value.size
    }.forEach(::println)
}