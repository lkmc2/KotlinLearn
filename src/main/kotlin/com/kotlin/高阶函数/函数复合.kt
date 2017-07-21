package com.kotlin.高阶函数


/**
 * Created by Lin Change on 2017-07-17.
 */
/**
 * 函数复合
 * f(g(x))
 * 可以使用拓展函数进行函数的复合，以进行函数调用的简化
 */
val add5 = { i: Int -> i + 5 } //g(x)，lambda表达式，返回i+5

val multiplyBy2 = { i: Int -> i * 2 } //f(x)，lambda表达式，返回i * 2

fun main(args: Array<String>) {
    println(multiplyBy2(add5(8))) // ( 5 + 8 ) * 2

    val add5AndMultiplyBy2 = add5 andThen multiplyBy2 //复合两个函数（复合函数后效果与multiplyBy2一致）
    println(add5AndMultiplyBy2(8)) //执行调用函数 m(x)=f(g(x)) ( 5 + 8 ) * 2

    val add5ComposeMultiplyBy2 = add5 compose multiplyBy2 //复合两个函数（复合函数后效果与add5AndMultiplyBy2相反）
    println(add5ComposeMultiplyBy2(8)) //执行调用函数 m(x)=g(f(x)) ( 8 * 2 ) + 5
}

/**
 * 此方法拓展了Function1（有一个参数的方法，第一个泛型为参数类型，第二个泛型为返回值类型），
 * 并使用中缀表达式进行操作，用于结合两个函数，
 * 下面的泛型参数，<P1,P2>为泛型的方法是在中缀表达式之前那个，而<P2,R>为泛型的方法是中缀表达式后面那个，
 * p1代表的是传入<P2,,R>方法中的参数，也就是上面的8，this.invoke(p1)表示调用<P1,P2>方法，
 * 之后将其值传给function，也就是<P2,R>为泛型的方法，调用该方法后返回其值，
 * 总体来说就是调用完一个有一个参数的方法，再调用另一个有一个参数的方法
 */
infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

//该方法与andThen调用的顺序不一样
infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}
