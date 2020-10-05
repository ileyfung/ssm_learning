package com.lifeng.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//读取配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		Hello hello = (Hello)context.getBean("hello");
		hello.helloWorld();
	}
}
