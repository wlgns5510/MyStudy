package com.javaex.javaStudy;

class A {

	String num01 = "static X";	//객체 생성 후 사용
	static String num02 = "static O";	//객체 생성없이 사용
}

public class Ex01 {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.num01);    //static 사용하지 않은 필드 가져오기
		
		System.out.println(A.num02);	//static 사용한 필드 가져오기
	}
}


