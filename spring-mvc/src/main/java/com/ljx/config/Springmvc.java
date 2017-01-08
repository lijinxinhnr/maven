package com.ljx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ljx.interceptors.MyInterceptor;
import com.ljx.interceptors.MyInterceptor2;

@Configuration
@EnableWebMvc
@ComponentScan(value = { "com.ljx.controllor", "com.ljx.interceptors" })
public class Springmvc extends WebMvcConfigurerAdapter {

	// 配置视图解析器------------------------------------------------------------------

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views");
		viewResolver.setSuffix(".html");
		return viewResolver;
	}

	// 配置视图解析器------------------------------------------------------------------

	// 静态资源----------------------------------------------------------------------

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/asserts/**").addResourceLocations(
				"classpath:/asserts/");
	}

	// 静态资源----------------------------------------------------------------------

	// 拦截器------------------------------------------------------------------------

	@Bean
	public MyInterceptor myInterceptor() {
		return new MyInterceptor();
	}

	@Bean
	public MyInterceptor2 myInterceptor2() {
		return new MyInterceptor2();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor());
		registry.addInterceptor(myInterceptor2());
	}

	// 拦截器------------------------------------------------------------------------

	// 文件上传-----------------------------------------------------------------------
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(102400);
		return multipartResolver;
	}
	// 文件上传-----------------------------------------------------------------------
}
