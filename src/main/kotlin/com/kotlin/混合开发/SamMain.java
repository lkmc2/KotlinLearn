package com.kotlin.混合开发;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/**
 * Created by Lin Change on 2017-07-18.
 */
public class SamMain {
    public static void main(String[] args) {
        SAMInKotlin samInKotlin = new SAMInKotlin();
        samInKotlin.addTask(new Function0<Unit>() {
            @Override
            public Unit invoke() {
                return null;
            }
        });
    }
}
