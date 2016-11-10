package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java2novice.beans.SpringFirstTest;

public class SpringDemo {

	public static void main(String args[]) {
		String confFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		SpringFirstTest sft = (SpringFirstTest) context.getBean("springTest");
		sft.testMe();
	}
}
