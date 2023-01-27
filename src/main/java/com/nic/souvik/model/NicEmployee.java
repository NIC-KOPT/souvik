package com.nic.souvik.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class NicEmployee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id, fname, mname, lname , address;
	private int age;
	private Date bdate;
	private BigDecimal salary;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "NicEmployee [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", address="
				+ address + ", age=" + age + ", bdate=" + bdate + ", salary=" + salary + "]";
	}
	
}
