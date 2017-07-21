package com.kotlin.面向对象;

/**
 * Created by Lin Change on 2017-07-14.
 */
public class InnerClassJava {
    private int a;

    public class Inner { //非静态内部类可以访问外部类的属性
        public void show() {
            System.out.println(InnerClassJava.this.a);
        }
    }

    public static class Inner2 {
        public void show() { //静态内部类不能访问外部类的属性，不持有外部类的状态
//            System.out.println(InnerClassJava.this.a);
        }
    }


    public static void main(String[] args) {
        InnerClassJava innerClassJava = new InnerClassJava(); //非静态内部类需要外部类才能构造
        Inner inner = innerClassJava.new Inner();

        Inner2 inner2 = new Inner2(); //非静态内部类不需要外部类就可以构造

        View view = new View();
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {

            }
        });
    }
}
