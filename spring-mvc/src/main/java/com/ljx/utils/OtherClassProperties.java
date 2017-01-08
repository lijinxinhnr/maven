package com.ljx.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OtherClassProperties {

	@Value("其他类的属性")
	private String othername;
}
