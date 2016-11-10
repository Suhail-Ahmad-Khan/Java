package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java2novice.bean.MyBusinessService;

@Configuration
public class businessConfig {

	@Bean(name = "bussService")
	public MyBusinessService getBusinessService() {
		return new MyBusinessService();
	}
}
