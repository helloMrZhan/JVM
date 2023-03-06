package com.zjq.jvm.classfile;

/**
 * @author zjq
 * @date 2023/3/5 13:13
 * <p>title:测试哪些对象会进入常量池</p>
 * <p>description:</p>
 */
public class TestCpinfo {

    private int int_num = 110;
    private char char_num = 'a';
    private short short_num = 120;
    private float float_num = 130.0f;
    private double double_num = 140.0;
    private byte byte_num = 111;
    private long long_num = 3333L;
    private long long_delay_num;
    private boolean boolean_flage = true;
    private final int final_int_num = 220;
    private final short final_double_num = 666;
    public void init() {
        this.long_delay_num = 5555L;
    }
}
