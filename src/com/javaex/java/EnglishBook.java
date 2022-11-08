package com.javaex.java;

public class EnglishBook extends Book {
	
	//오버라이딩
	public void showPrice() {	
		System.out.println("영어책 가격: " + price);
	}
	
	//오버로딩
	public void showPrice(int count) {
		System.out.println("영어책 " +count + "권 가격: " + price * count);
	}
	
}
