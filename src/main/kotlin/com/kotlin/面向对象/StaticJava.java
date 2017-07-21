package com.kotlin.面向对象;

/**
 * Created by Lin Change on 2017-07-13.
 */
public class StaticJava {
    public static void main(String[] args) {
        Latitude latitude = Latitude.Companion.ofDouble(3.0); //使用伴生对象中的方法（静态方法），需先访问Companion对象
        Latitude latitude2 = Latitude.ofDouble(4.0); //给伴生对象的方法加上@JvmStatic注解后，可以直接调用其中的方法
    }
}
