package com.cq.entity;
/**
 * 
 * @author W519
 *@createDate 2019-4-8
 *@updateDate 2019-4-8
 *@version 1.0
 */
public class Hello {
	/**
	 * ���hello name
	 * @param name ����
	 */
	public void say(String name) {
		System.out.println("Hello"+name);		
	}
	public void say1(String name) {
		System.out.println("Hello"+name);		
	}
	/**
	 *��� Hello Maven
	 * @return Hello Maven
	 */
	public String out() {
		return "Hello Maven";
	}
}
