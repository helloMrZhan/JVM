package com.zjq.jvm.heap;

/**
 * @author zjq
 * @date 2023/3/13 20:08
 * @description: 堆空间测试 （设置-Xms64m -Xmx64m）
 *
 */
public class HeapDemo {

    public static void main(String[] args) {
        System.out.println("======start=========");
        try {
            Thread.sleep(1000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("========end=========");
    }
}
