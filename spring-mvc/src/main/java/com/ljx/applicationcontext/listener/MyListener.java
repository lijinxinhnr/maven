package com.ljx.applicationcontext.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ljx.applicationcontext.event.MyApplicationEvent;

@Component
public class MyListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(final MyApplicationEvent mEvent) {
		new Thread() {
			@Override
			public void run() {
				super.run();
				System.out.println(11111);
				System.out.println(mEvent.getMsg());
			}
		}.start();

	}
}
