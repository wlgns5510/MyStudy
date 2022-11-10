package com.javaex.java;

public class Sonata1 implements Car {

	@Override
	public void speakCarName() {
		System.out.println("소나타");
	}
	
	@Override
	public void speakCarBrand() {
		System.out.println("현대");
	}
}
