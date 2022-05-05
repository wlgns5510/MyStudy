package com.javaex.ex12;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("kim");
//		list.add("kang");
//		list.add("kim");
//		
//		System.out.println(list.size());
//		
//		for(int i=0; i<list.size();i++) {
//			String str = list.get(i);
//			System.out.println(str);
//		}
		
		List<String> li = new ArrayList<String>();
		li.add("안녕");
		li.add("하세요");
		li.add("반갑");
		li.add("습니다");
		
		for(int i=0; i<li.size(); i++) {
			String str = li.get(i);
			System.out.print(str);
		}

	}
	

}
