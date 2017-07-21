package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
private const val USERNAME = "kk" //用户名
private const val PASSWORD = "123456" //密码

private const val ADMIN_USER = "admin" //管理员用户名
private const val ADMIN_PASSWORD = "admin" //管理员密码

private const val USER = 0 //用户模式
private const val DEBUG = 1 //调试模式

fun main(args: Array<String>) {
    //当args参数非空且第0个参数为1时进入DEBUG模式，不然进入USER模式
    val mode = if (args.isNotEmpty() && args[0] == "1") { DEBUG } else { USER }

    println("请输入用户名：")
    val username = readLine() //读取用户输入信息
    println("请输入密码：")
    val password = readLine() //读取用户输入信息

    if (mode == DEBUG && username == ADMIN_USER && password == ADMIN_PASSWORD) { //模式为调试模式，且登陆的是管理员
        println("管理员登陆成功")
    } else if (username == USERNAME && password == PASSWORD) { //调试模式为空，且登陆的是普通用户
        println("登陆成功")
    } else {
        println("登陆失败")
    }
}