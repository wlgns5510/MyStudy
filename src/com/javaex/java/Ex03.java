package com.javaex.java;


public class Ex03 {
	
	//불변이 아닌 객체
	public String name;
	public int age;
	
	public Ex03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메서드gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
