package com.zjq.jvm.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjq
 * @date 2023/3/27 20:38
 * @description: GC使用测试
 *
 * -Xms10m -Xmx10m -XX:+PrintCommandLineFlags -XX:+UseConcMarkSweepGC
 */
public class GCUseTest {

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true){
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
