package com.zjq.jvm.heap;

/**
 * 1.设置堆空间大小的参数
 * -X是jvm的运行参数
 * -Xms 用来设置堆空间（年轻代+老年代）的初始内存大小
 * -Xms 用来设置堆空间（年轻代+老年代）的最大内存大小
 *
 * 2.手动设置 -Xms600m -Xmx600m
 * 开发中建议将初始化堆内存和最大的堆内存设置成相同的值
 *
 * 3.查看设置的参数：
 * 方式一：  jps / jstat -gc 进程id
 * 方式二： -XX：+PrintGCDetails
 *
 * 4.默认值
 * 初始内存大小：物理电脑内存大小 /64; 最大内存大小：物理电脑内存大小 /4
 * @author zjq
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        long initMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + initMemory + " M");
        System.out.println("-Xmx:" + maxMemory + " M");
        System.out.println("系统内存⼤⼩:" + initMemory * 64.0 / 1024 + " G");
        System.out.println("系统内存⼤⼩:" + maxMemory * 4.0 / 1024 + " G");
    }
}
