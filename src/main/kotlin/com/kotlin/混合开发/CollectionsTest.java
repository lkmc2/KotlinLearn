package com.kotlin.混合开发;

/**
 * Created by Lin Change on 2017-07-18.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        Test.INSTANCE.getList().add(8); //此处在kotlin用listOf（）生成的方法没有添加和删除的方法，调用add方法执行会报错
    }
}
