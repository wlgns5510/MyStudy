package com.javaex.java;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		String[] name = {"양지훈", "최종원", "이정화", "이재호", "이진호"};
		
		int[] age = {27, 27, 31, 24, 22};
		
		
		
		Arrays.sort(name);
		
		
		System.out.println(Arrays.binarySearch(name, "양지훈"));
		
	}

}

