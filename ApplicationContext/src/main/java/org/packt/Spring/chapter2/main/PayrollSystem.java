package org.packt.Spring.chapter2.main;

import org.packt.Spring.chapter2.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService empService = (EmployeeServiceImpl) context.getBean("empServiceBean");

		System.out.println("Unique Employee ID: " + empService.generateEmployeeId());
	}
}
