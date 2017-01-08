package com.ljx.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:/properties/cfg.properties" })
public class ConfigProperties {
	@Value("hello hi")
	private String normal;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{T(java.lang.Math).random()*100}")
	private double tandomNum;

	@Value("${p.age}")
	private int age;

	@Value("${p.name}")
	private String name;

	@Override
	public String toString() {
		return "ConfigProperties [normal=" + normal + ", osName=" + osName
				+ ", tandomNum=" + tandomNum +", age=" + age + ", name="
				+ name + "]";
	}
}
