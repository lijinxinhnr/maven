package com.ljx.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MySchedule {
	@Scheduled(fixedRate = 5000)
	public void doWork() {
		System.out.println("我在计划执行");
	}

	@Scheduled(cron = "0/3 * * * * ?")
	public void doWork1() {
		System.out.println("我在计划执行cron");
	}

}
