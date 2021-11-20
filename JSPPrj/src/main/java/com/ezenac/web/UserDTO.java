package com.ezenac.web;

import java.util.Date;

public class UserDTO {
	
	private String id;
	private String name;
	private String addr;
	private String phone;
	private String email;
	private String hire_date;
	private String emp_no;
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(String id, String name, String addr, String phone, String email, String hire_date, String emp_no) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.email = email;
		this.hire_date = hire_date;
		this.emp_no = emp_no;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	
	
}
