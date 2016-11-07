package org.springframework.chapter1.main;

import org.springframework.chapter1.service.GreetingMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService greetingMessageService = (GreetingMessageService) context
				.getBean("greetingMessageServiceImpl");
		System.out.println(greetingMessageService.greetUser());
	}
}
