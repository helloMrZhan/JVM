package com.zjq.jvm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试堆内存撑满的情况 （-Xmx256m -Xms256m）
 *
 * @author zjq
 */
public class HeapInstanceTest2 {


    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<Picture>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
