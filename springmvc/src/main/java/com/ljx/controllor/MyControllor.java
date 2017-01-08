package com.ljx.controllor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllor {

	private static Logger LOG = LoggerFactory.getLogger(MyControllor.class);

	@RequestMapping(value = "hello")
	public String hello() {
		LOG.info("nihao");
		return "ok";
	}
}
