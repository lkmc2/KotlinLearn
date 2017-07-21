package com.kotlin.面向对象;

/**
 * Created by Lin Change on 2017-07-13.
 */

/**
 * kotlin的object的对应单例的java代码
 */
public class MusicPlayerJava {
    static {
        new MusicPlayerJava();
    }

    private static MusicPlayerJava INSTANCE = new MusicPlayerJava();

    private MusicPlayerJava() {
        INSTANCE = (MusicPlayerJava) this;
    }
}
