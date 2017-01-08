package com.ljx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MySchedule {
	private static Logger LOG = LoggerFactory.getLogger(MySchedule.class);

	@Scheduled(fixedRate = 5000)
	public void doWork() {
		LOG.info("我在计划执行doWork");
	}

	@Scheduled(cron = "0/3 * * * * ?")
	public void doWork1() {
		LOG.info("我在计划执行doWork1");
	}

}
