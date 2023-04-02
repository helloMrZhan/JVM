package com.zjq.jvm.heap;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * jstack 案例
 * @author zjq
 * @date 2023/4/1 18:37
 * @description:
 */
public class JStackCase {

    public static Executor executor = Executors.newFixedThreadPool(3);
    public static Object lock = new Object();

    public static void main(String[] args) {
        StackTask task1 = new StackTask();
        StackTask task2 = new StackTask();
        executor.execute(task1);
        executor.execute(task2);
    }
    static class StackTask implements Runnable{

        @Override
        public void run(){
            synchronized (lock){
                cal();
            }
        }
        public void cal(){
            int i=0;
            while(true){
                i++;
            }
        }
    }
}
