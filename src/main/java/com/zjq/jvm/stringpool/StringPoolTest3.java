package com.zjq.jvm.stringpool;

import org.junit.Test;

/**
 * 字符串常量池测试
 * @author zjq
 */
public class StringPoolTest3 {

	public static void main(String[] args) throws Exception {

		String a = new String("1") + new String("1") ;
		a.intern();
		String b = "11" ;
		System.out.println(a == b);

	}

	@Test
	public void test(){
		String a = new String("1") + new String("1") ;
		a.intern();
		String b = "11" ;
		System.out.println(a == b);
	}

}
