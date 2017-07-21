package com.kotlin.数据类型;

/**
 * Created by Lin Change on 2017-07-09.
 */
public class 空类型安全例子 {
    public static void main(String[] args) {
        String name = getName();
        if (name == null) {
            System.out.println("name is invalid");
        } else {
            System.out.println(getName().length());
        }
    }

    public static String getName() {
        return null;
    }
}
