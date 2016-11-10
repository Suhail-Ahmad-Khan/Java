package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.bean.ColorManager;

public class SetterDemo {

	public static void main(String a[]) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ColorManager clrManager = (ColorManager) context.getBean("colorManager");
		clrManager.printColor();
	}
}