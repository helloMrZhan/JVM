package com.zjq.jvm.stringpool;

import java.util.Random;

/**
 * intern()使用
 * @author zjq
 */
public class StringPoolTest2 {


    /** 字符串数组的⻓度*/
    static final int MAX = 1000 * 10000;
	/** 字符串数组*/
    static final String[] ARR = new String[MAX];

    public static void main(String[] args) throws Exception {
		// 随机数数组
        Integer[] DB_DATA = new Integer[10];
		// 随机数对象
        Random random = new Random(10 * 10000);
		// 产⽣10个随机数，放入DB_DATA数组中保存
        for (int i = 0; i < DB_DATA.length; i++) {
            DB_DATA[i] = random.nextInt();
        }
        long t = System.currentTimeMillis();
		// 存储1000*10000个字符串对象
        for (int i = 0; i < MAX; i++) {
        	//会产生大量重复字符串
//			ARR[i] = new String(String.valueOf(DB_DATA[i %
//					DB_DATA.length]));
            ARR[i] = new String(String.valueOf(DB_DATA[i %
                    DB_DATA.length])).intern();
		// arr[i] = new String("1")+new String("11");
		// arr[i] = new String(”111“).intern();
		// arr[i] = new String(”111“).intern();
        }
        System.out.println((System.currentTimeMillis() - t) +
                "ms");
        System.in.read();
//        System.gc();
    }
}
