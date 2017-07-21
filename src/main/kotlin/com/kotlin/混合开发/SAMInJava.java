package com.kotlin.混合开发;

import java.util.ArrayList;

/**
 * Created by Lin Change on 2017-07-18.
 */
public class SAMInJava {
    private ArrayList<Runnable> runnables = new ArrayList<Runnable>();

    public void addTask(Runnable runnable) {
        runnables.add(runnable);
        System.out.println("添加:" + runnable + "任务之后,一共有" + runnables.size() + "个任务");
    }

    public void removeTask(Runnable runnable) {
        runnables.remove(runnable);
        System.out.println("删除:" + runnable + "任务之后,一共有" + runnables.size() + "个任务");
    }
}
