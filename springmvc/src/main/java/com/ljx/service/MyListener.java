package com.ljx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<ContextRefreshedEvent>{
	private static Logger LOG = LoggerFactory.getLogger(MyListener.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		new Thread() {
			@Override
			public void run() {
				super.run();
				LOG.info("程序启动执行");
			}
		}.start();
	}
}
