package com.javaex.java;

public class Morning implements Car {

	@Override
	public void speakCarName() {
		System.out.println("모닝");
	}
	
	@Override
	public void speakCarBrand() {
		System.out.println("기아");
	}
}

class Sonata implements Car {

	@Override
	public void speakCarName() {
		System.out.println("소나타");
	}
	
	@Override
	public void speakCarBrand() {
		System.out.println("현대");
	}
}
