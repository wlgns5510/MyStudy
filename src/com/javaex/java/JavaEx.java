package com.javaex.java;

public class JavaEx {
	
	//필드
	private String id;
	private String pw;
	private String name;
	
	
	//생성자
	public JavaEx() {}	//기본생성자
	
	public JavaEx(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	//메소드gs
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	//메소드 일반
	@Override
	public String toString() {
		return "JavaEx [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
}
