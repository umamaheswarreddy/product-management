package com.cts.exception;

import java.util.Date;

public class ErrorDetails {
	private Date timestamp;
	private String msg;
	private String deatils;
	
	
	
	public ErrorDetails() {
		super();
	}

	public ErrorDetails(Date timestamp, String msg, String deatils) {
		super();
		this.timestamp = timestamp;
		this.msg = msg;
		this.deatils = deatils;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDeatils() {
		return deatils;
	}

	public void setDeatils(String deatils) {
		this.deatils = deatils;
	}
	
	
	
	

}
