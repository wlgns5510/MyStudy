package com.javaex.ex02;

public class Bus extends Car{
	public void run() {
		//super.run(); //super를 사용하면 부모의 메소드를 호출할 수 있음
		System.out.println("Bus의 run 메소드");
	}
}
