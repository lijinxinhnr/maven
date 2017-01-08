package com.ljx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ljx.applicationcontext.ApplicationContext;
import com.ljx.applicationcontext.event.MyPublish;
import com.ljx.service.impl.EmailServiceImpl;
import com.ljx.service.impl.NoAnnotationService;
import com.ljx.utils.ConfigProperties;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationContext.class);

		EmailServiceImpl emailServiceImpl = context
				.getBean(EmailServiceImpl.class);

		NoAnnotationService noAnnotationService = context
				.getBean(NoAnnotationService.class);
		
		ConfigProperties c = context
				.getBean(ConfigProperties.class);
		
		MyPublish p = context
				.getBean(MyPublish.class);
		p.publish("你妹啊");
		System.out.println(c);
		noAnnotationService.say();
		try {
			emailServiceImpl.sendEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
