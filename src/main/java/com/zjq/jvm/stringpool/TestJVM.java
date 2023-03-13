package com.zjq.jvm.stringpool;

public class TestJVM {
	public static void main(String[] args) {
		String str = System.getProperty("str");
		if (str == null) {
			System.out.println("共饮一杯无");
		} else {
			System.out.println(str);
		}
	}


}
