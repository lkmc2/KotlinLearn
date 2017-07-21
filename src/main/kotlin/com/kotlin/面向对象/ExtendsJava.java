package com.kotlin.面向对象;

/**
 * Created by Lin Change on 2017-07-14.
 */
public class ExtendsJava {
    public static void main(String[] args) {
        if (Utils.isEmpty(args)) {

        }

        if (Utils.isNoEmpty(args)) {

        }
        System.out.println(拓展方法Kt.multiply("haha", 10)); //调用在kotlin定义的拓展方法
    }
}
