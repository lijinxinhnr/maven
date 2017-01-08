package com.config.web;

import javax.servlet.Filter;

import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.config.configuration.ApplicationContent;
import com.config.configuration.SpringmvcConfig;

@Order(2)
public class MyDispatcherServlet extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	// 应用上下文（除web）
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationContent.class };
	}

	// web上下文
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected Class[] getServletConfigClasses() {
		return new Class[] { SpringmvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	// 编码过滤器
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return new Filter[] { characterEncodingFilter };
	}
}
