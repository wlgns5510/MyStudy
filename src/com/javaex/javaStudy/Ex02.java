package com.javaex.javaStudy;


class Test {	
	int a;
	static int b;
	
	void c() {
		System.out.println("메소드c실행: a,b,d() 사용가능");	//모든 멤버 사용가능
	}
	static void d() {
		System.out.println("메소드d실행: b 사용가능");	//같은 static멤버만 사용가능
	}
	
}

public class Ex02{
	public static void main(String[] args) {
		Test test = new Test();
		test.c();	//인스턴스 생성 후 사용
		
		Test.d();	//인스턴스 생성없이 바로사용
		
		
	}
}
