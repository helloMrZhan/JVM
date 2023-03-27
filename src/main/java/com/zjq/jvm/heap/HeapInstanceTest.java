package com.zjq.jvm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试堆内存撑满的情况 （-Xmx256m -Xms256m  -XX:+PrintGCDetails）
 * @author zjq
 */
public class HeapInstanceTest {


    byte[] buffer = new byte[new Random().nextInt(1024*100)];

    public static void main(String[] args) {
        List<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();
        while (true){

            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
