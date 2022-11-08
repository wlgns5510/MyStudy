package com.javaex.java;

public class HelloWorld {

	public static void main(String[] args) {
		
		Dancer dancer = new Dancer();
		
		dancer.name = "양지훈";
		dancer.getAge();	//private으로 잠겨있기 때문에 get을 사용해야함
		dancer.speak();	//Person을 상속받은 Dancer가 Person의 메소드인 speak();를 사용
		dancer.dance();

	}

}
