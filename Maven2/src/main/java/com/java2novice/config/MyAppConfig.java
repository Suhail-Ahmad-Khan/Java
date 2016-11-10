package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.java2novice.bean.MyColor;
import com.java2novice.bean.RedColor;

@Configuration
public class MyAppConfig {

	@Bean(name = "myColorBean")
	public MyColor getMyColors() {
		return new RedColor();
	}
}
