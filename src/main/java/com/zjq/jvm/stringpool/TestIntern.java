package com.zjq.jvm.stringpool;

import org.junit.Test;

/**
 * @author zjq
 * @date 2023/3/11 16:19
 * @description: String intern()方法测试
 */
public class TestIntern {


    @Test
    public void testIntern(){
        String c = "world";
        // true
        System.out.println(c.intern() == c);
        String d = new String("mike");
        // false
        System.out.println(d.intern() == d);
        String e = new String("jo") + new String("hn");
        // true
        System.out.println(e.intern() == e);
        String f = new String("ja") + new String("va");
        // false
        System.out.println(f.intern() == f);
    }
}
