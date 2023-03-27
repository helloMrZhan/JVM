package com.zjq.jvm.heap;

import java.util.ArrayList;
import java.util.Random;

/**
 * 测试堆内存撑满并记录堆dump文件 （-Xmx100m -Xms100m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/JVM/dump）
 *
 * @author zjq
 */
public class OOMTest {


    public static void main(String[] args) {
        ArrayList<Media> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Media(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Media {
    private byte[] mediaLength;

    public Media(int length) {
        this.mediaLength = new byte[length];
    }
}
