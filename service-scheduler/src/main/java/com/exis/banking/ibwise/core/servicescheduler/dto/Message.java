package com.exis.banking.ibwise.core.servicescheduler.dto;

import java.io.Serializable;

public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7297901676090999479L;
	
	private boolean valid;
	private String msg;
	private Object data;
	
	public Message(boolean valid, String msg) {
		super();
		this.valid = valid;
		this.msg = msg;
	}
	public Message(boolean valid) {
		super();
		this.valid = valid;
	}
	
	public static Message failure(String msg) {
		return new Message(false, msg);
	}
	public static Message failure(Exception e) {
		return new Message(false, e.getMessage());
	}
	public static Message failure() {
		return new Message(false);
	}
	public static Message success() {
		return new Message(true);
	}
	public static Message success(String msg) {
		return new Message(true, msg);
	}
	
	public void setData(Object data) {
		this.valid = true;
		this.data = data;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	
	
}