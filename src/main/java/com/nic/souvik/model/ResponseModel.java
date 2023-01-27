package com.nic.souvik.model;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Object data;
	private String status;
	private String message;
	private ArrayList<ErrorBean> error = new ArrayList<ErrorBean>();
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setStatMsg(String status,String message) {
		this.status = status;
		this.message = message;
	}
	public ArrayList<ErrorBean> getError() {
		return error;
	}
	public void setError(ArrayList<ErrorBean> error) {
		this.error = error;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
