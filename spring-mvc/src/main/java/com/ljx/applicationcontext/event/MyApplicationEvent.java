package com.ljx.applicationcontext.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class MyApplicationEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8159288010803626385L;

	private String msg;

	public MyApplicationEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
