package com.kotlin.混合开发;

import java.io.*;

/**
 * Created by Lin Change on 2017-07-18.
 */
public class JavaIO {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null; //缓冲读取器

        try {
            //build.gradle的文件内容读取进缓冲读取器
            bufferedReader = new BufferedReader(new FileReader(new File("build.gradle")));
            String line;
            while ((line = bufferedReader.readLine()) != null) { //读取一行
                System.out.println(line); //打印一行数据
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close(); //关闭缓冲读取器
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
