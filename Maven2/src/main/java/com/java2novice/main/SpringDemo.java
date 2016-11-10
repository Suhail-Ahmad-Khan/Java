package com.java2novice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.java2novice.bean.MyColor;
import com.java2novice.config.MyAppConfig;

public class SpringDemo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyColor color = (MyColor) context.getBean("myColorBean");
		color.printColor();
	}
}
