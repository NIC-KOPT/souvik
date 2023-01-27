package com.nic.souvik.model;

import java.io.Serializable;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class RequestModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Device device_info;
	private String from_date;
	private String to_date;
	private String user_id;
	private Map<String , String> body;
	private Map<String , String> header;
	public Device getDevice_info() {
		return device_info;
	}
	public void setDevice_info(Device device_info) {
		this.device_info = device_info;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Map<String, String> getBody() {
		return body;
	}
	public void setBody(Map<String, String> body) {
		this.body = body;
	}
	public Map<String, String> getHeader() {
		return header;
	}
	public void setHeader(Map<String, String> header) {
		this.header = header;
	}
	@Override
	public String toString() {
		return "RequestModel [device_info=" + device_info + ", from_date=" + from_date + ", to_date=" + to_date
				+ ", user_id=" + user_id + ", body=" + body + ", header=" + header + "]";
	}
	
	
	
	
}
