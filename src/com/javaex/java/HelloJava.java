package com.javaex.java;

public class HelloJava {

	public static void main(String[] args) {
		
		EnglishBook book = new EnglishBook();
		
		//오버라이딩으로 내용을 변경한 showPrice메서드
		book.showPrice();
		
		//오버로딩으로 매개변수를 설정한 showPrice메서드
		book.showPrice(3);

	}

}
