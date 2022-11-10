package com.javaex.java;

public class Ex01 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		
		if(s1 == s2) {
			System.out.println("동일합니다");
		}
		else {
			System.out.println("동일하지 않습니다");
		}
	}
}
