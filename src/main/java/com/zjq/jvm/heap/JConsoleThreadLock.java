package com.zjq.jvm.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zjq
 * @date 2023/4/6 13:02
 * @description: 等待控制台输⼊、死循环演示、线程锁等待
 */
public class JConsoleThreadLock {

    /**
     * 等待控制台输⼊
     * @throws IOException
     */
    public static void waitRerouceConnection () throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        br.readLine();
    }
    /**
     * 线程死循环演示
     */
    public static void createBusyThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    ;
            }
        }, "testBusyThread");
        thread.start();
    }
    /**
     * 线程锁等待演示
     */
    public static void createLockThread(final Object lock) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws IOException {
        createBusyThread();
    }
}
