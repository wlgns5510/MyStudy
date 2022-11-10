package com.javaex.java;


public class Ex04 {
	
	//불변인 객체
	public final String name;
	public final int age;
	
	public Ex04(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메서드gs
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
