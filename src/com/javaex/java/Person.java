package com.javaex.java;

public class Person {
	//필드
	String name;
	private int age = 27;
	
	//메소드gs
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드일반
	public void speak() {
		System.out.println("저는 " + name + "이고 " + age + "살 입니다.");	
	}
}

class Dancer extends Person {
	public void dance() {
		Person person = new Person();
		System.out.println(name + "이 춤을 춥니다.");
		System.out.println(name + "은 " + person.getAge() + "살 입니다.");
	}
}


