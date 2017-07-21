package com.kotlin.面向对象;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lin Change on 2017-07-14.
 */
public class Bug {
    public static void main(String[] args) {
        //此例无法调用重载方法remove(Object object)，只能使用remove(Object object)
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(13);
        integerList.add(2);
        integerList.add(3);
        integerList.add(23);
        integerList.add(24);
        integerList.add(55);
        integerList.add(66);
        System.out.println(integerList);

        integerList.remove(1);
        integerList.remove(5);
        System.out.println(integerList);

//        Overloads overloads = new Overloads();
//        overloads.a();
//        overloads.a(2);
    }
}
