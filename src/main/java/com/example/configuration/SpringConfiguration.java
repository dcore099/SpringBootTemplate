package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.BasicServiceImpl;

@Configuration
public class SpringConfiguration {

	@Bean
	public BasicServiceImpl getBasicServiceImpl() {
		BasicServiceImpl ob = new BasicServiceImpl();
		return ob;
	}
}
