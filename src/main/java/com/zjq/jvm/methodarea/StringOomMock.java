package com.zjq.jvm.methodarea;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串OOM异常验证
 * @author zjq
 */
public class StringOomMock {
	static String base = "string";

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str = base + base;
			base = str;
			list.add(str.intern());
		}
	}
}
