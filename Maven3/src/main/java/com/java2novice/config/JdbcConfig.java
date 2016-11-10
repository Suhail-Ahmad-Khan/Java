package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java2novice.bean.MyJdbcService;

@Configuration
public class JdbcConfig {

	@Bean(name = "jdbcService")
	public MyJdbcService getJdbcService() {
		return new MyJdbcService();
	}
}
