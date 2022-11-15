package com.javaex.java;

import java.util.HashMap;

public class Ex09 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();	//HashMap 생성
		
		map.put(1, "딸기");	//put을 이용해서 값 넣기
		map.put(2, "포도");
		map.put(3, "오렌지");
		map.put(4, "복숭아");
		
		map.remove(1);	//Key가 1인 "딸기"데이터를 지우기
		map.clear();  //모든 데이터 지우기
		
		
		System.out.println(map);
		

	}

}
