package com.ljx.applicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ljx.service.impl.NoAnnotationService;

@Configuration
@ComponentScan("com.ljx")
@EnableAsync
@EnableScheduling
public class ApplicationContext {

	@Bean
	public NoAnnotationService noAnnotationService() {
		return new NoAnnotationService();
	}
	
}
