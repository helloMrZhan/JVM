package com.zjq.jvm.stringpool;

import java.util.Random;
import java.lang.String;
/**
 * 字符串常量池测试
 * @author zjq
 */
public class StringPoolTest4 {

//	public static void main(String[] args) throws Exception {
//		Random random = new Random(10);
//		String s1 = new String(random.nextInt() + "").intern();
//		String s2 = new String(random.nextInt() + "").intern();
//		System.out.println(s1 == s2);
//	}


	public static void main(String[] args) {
		String s = new String("1");
		s.intern();
		String s2 = "1";
		// false
		System.out.println(s == s2);
		String s3 = new String("1") + new String("1");
		s3.intern();
		String s4 = "11";
		// true
		System.out.println(s3 == s4);
	}

	/**
	 * 将s3.intern( );语句下调一行,放到String s4 = "11";后面。将s.intern();放到String s2 = "1 ";后面。
	 * @param args
	 */
//	public static void main(String[] args) {
//		String s = new String("1");
//		String s2 = "1";
//		s.intern();
//		// false
//		System.out.println(s == s2);
//		String s3 = new String("1") + new String("1");
//		String s4 = "11";
//		s3.intern();
//		// false
//		System.out.println(s3 == s4);
//	}
}
