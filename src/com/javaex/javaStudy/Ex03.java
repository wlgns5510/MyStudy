package com.javaex.javaStudy;

class B{
	
	static int b;
	static {
		b = 5;
		System.out.println("클래스 B의 static블럭 자동실행");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		//B.b가 실행되는 시점에 클래스 B가 메모리에 로딩되면서 static{}초기화 블록이 실행
		System.out.println(B.b);	
		
	}
}
