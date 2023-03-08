package com.zjq.jvm.methodarea;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import java.util.concurrent.TimeUnit;

/**
 *
 * 方法区内存溢出测试：
 * JDK1.8之前使用的方法区实现是永久代，JDK1.8及以后使用的方法区实现是元空间
 *
 * @author zjq
 */
public class PermGenOomMock {
	public static void main(String[] args) throws InterruptedException {
		while (true){
			TimeUnit.MILLISECONDS.sleep(100L);
			Enhancer enhancer =new Enhancer();
			enhancer.setUseCache(false);
			enhancer.setCallback((MethodInterceptor)(obj, method, arg, proxy)->
					proxy.invokeSuper(obj, arg));
			enhancer.create();
		}

	}
}
