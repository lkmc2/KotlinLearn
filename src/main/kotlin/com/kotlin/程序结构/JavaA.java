package com.kotlin.程序结构;

/**
 * Created by Lin Change on 2017-07-10.
 */
public class JavaA {
    private int b = 0;

    public int getB() {
        System.out.println("尝试获取变量b的值");
        return b;
    }

    public void setB(int b) {
        System.out.println("尝试设置变量b的值");
        this.b = b;
    }
}
