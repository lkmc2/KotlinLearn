package com.kotlin.数据类型;

/**
 * Created by Lin Change on 2017-07-09.
 */
public class 类型转换例子 {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(((Child)parent).getName());

        parent = new Parent();
        System.out.println(((Child)parent).getName()); //将抛出类型转换异常

        if (parent instanceof Child) {
            System.out.println(((Child) parent).getName());
        }
    }
}
