package com.kotlin.领域特定语言

/**
 * Created by Lin Change on 2017-07-17.
 */
/**
 * 领域特定语言DSL
 * 概念：只在特定领域使用的语言，如：HTML、Gradle、SQL等等
 * 特点：1.是计算机编程语言
 * 2.具有语言的表达能力
 * 3.有限的表达能力
 * 4.关注某个特定的领域语言
 */
fun main(args: Array<String>) {
    Tag("html").apply { //生成网页方法1
        properties["id"] = "HtmlId"
        children.add(Tag("head"))
    }.render().let(::println)

    html { //生成网页方法2，此方法直接在函数html()中返回了Tag("Html").apply
        properties["id"] = "HtmlId"
        children.add(Tag("head"))
    }.render().let(::println)


    html { //生成网页方法3，此方法用字符串的拓展函数简化了标签的设置
        "id"("HtmlId")

        "head" {
            "id"("headId")
        }

        body {
            id = "bodyId"
            `class` = "bodyClass"

            "a" {
                "href"("https://www.qq.com")
                +"腾讯网"
            }
        }
    }.render().let(::println)
}