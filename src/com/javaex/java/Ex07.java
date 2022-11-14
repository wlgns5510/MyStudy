package com.javaex.java;

import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("양지훈");	//일반적인 방법
		arrayList.add(new String("최종원"));
		arrayList.add(1,"첫번째 요소");
		
		
		arrayList.remove(1);
		
		System.out.println(arrayList);

	}

}
