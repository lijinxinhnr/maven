package com.ljx.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllor {

	@RequestMapping("hello")
	public String hello() {
		return "hello2";
	}
}
