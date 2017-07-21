package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-12.
 */
/**
 * 接口与抽象类的区别：
 * 1.抽象类可以为属性设置值和getter、setter，而接口不可以
 * 2.抽象类和接口中都可以有默认的实现方法，但接口中的方法不能有状态，
 * 即涉及到属性的值需要到实现类中设置
 * 3.子类只能继承一个父类，但可以实现多个接口
 */
abstract class A { //抽象类
    var i = 0 //抽象类的属性可以有值

//    fun hello() { //普通的方法默认为final方法，不能被子类重写
//        println(i)
//    }

    open fun bye() { //添加open关键字的方法可被子类重写
        println("Bye Bye")
    }

    abstract fun say() //抽象方法一定要被子类重写
}

interface B { //接口
    var j:Int //接口中的属性不能有具体值

    fun hello() { //接口中已经实现了的方法，子类实现后可以不重写，也可以重写
        println(j)
    }

    fun say() //未实现的方法子类必须重写
}

class C: A() { //实现抽象类，需调用父类的构造方法
    override fun say() { //抽象方法必须重写

    }

    override fun bye() { //添加open关键字的方法可以被重写，但不是必须的
        super.bye()
    }

}

class D(override var j: Int): B { //实现接口需重写参数
    override fun say() { //接口中未默认实现的方法需重写

    }
}

class E(override var j: Int) : A(), B {
    override fun say() {

    }
}

fun main(args: Array<String>) {
    //多态，父类或已实现的接口指向子类的引用
    val a: A = E(0)
    val b: B = E(0)
    val e: E = E(0)

    if (e is A) { //表示e继承了抽象类A

    }

    if (e is B) { //表示e实现了接口B

    }
}