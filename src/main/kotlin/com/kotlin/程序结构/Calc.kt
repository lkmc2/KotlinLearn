package com.kotlin.程序结构

/**
 * Created by Lin Change on 2017-07-11.
 */
fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算式例如：3 + 4")
            val input = readLine()
            if (input != null) {
                val splits = input.trim().split(" ")

                if (splits.size < 3) {
                    throw IllegalArgumentException("参数个数不对")
                }

                val arg1 = splits[0].toDouble()
                val op = splits[1]
                val arg2 = splits[2].toDouble()

                println("$arg1 $op $arg2 = ${Operator(op).apply(arg1, arg2)}")
//                println("$arg1 $op $arg2 = ${Operator(op)(arg1, arg2)}") //该类调用invoke时使用
            }
        } catch(e: NumberFormatException) {
            println("你确定输入的是数字吗？")
        } catch (e: IllegalArgumentException) {
            println("你确定输入的是三个参数并用空格分隔的吗？")
        } catch (e: Exception) {
            println("发生未知异常，${e.message}")
        }

        println("再次运算？[Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }

    println("感谢使用")
}

class Operator(op: String) {
    val opFun: (left: Double, right: Double) -> Double //lambda表达式，返回两个参数的运算结果

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }

//    operator fun invoke(left: Double, right: Double): Double {
//        return opFun(left, right)
//    }
}
