package com.baidu.util;

public class Student {

	private String name;
	
	private String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", pwd=" + pwd + "]";
	}
	
	
}
