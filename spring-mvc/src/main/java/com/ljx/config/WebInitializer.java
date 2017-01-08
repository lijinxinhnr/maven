package com.ljx.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {

		// 配置web.xml中的springmvc
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Springmvc.class);// 把springmvc.xml注册进来
		context.setServletContext(servletContext);// 把配置放到容器中
		Dynamic servlet = servletContext.addServlet("springmvc",
				new DispatcherServlet(context));
		servlet.addMapping("/");// 映射
		servlet.setLoadOnStartup(1);// 初始化启动

	}

}
