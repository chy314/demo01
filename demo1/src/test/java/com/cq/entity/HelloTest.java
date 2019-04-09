package com.cq.entity;

import org.junit.Test;

import com.cq.util.PageUtil;

/**
 * helloname
 * @author W519
 *@createDate 2019-4-8
 *@updateDate 2019-4-8
 *@version 1.0
 */
public class HelloTest {
	/**
	 * 测试say方法
	 */
	Hello hello=new Hello();
	PageUtil p=new PageUtil();
	
	@Test
	public void say() {
		//调用say方法
		hello.say("Mary");
		hello.say1("Mary1");
	}
	
	/**
	 * 测试out方法
	 */
	@Test
	public void out() {
		String msg=hello.out();
		System.out.println(msg);
	}
}
