package com.javaex.ex13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>(); //set은 중복없음, boolean형으로 리턴
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang"); //중복이기 때문에 위의 2개만 저장함
		
		System.out.println(set1.size()); //2개
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> iter =set1.iterator(); //set에서 값을 하나씩 꺼내서 사용할때
		while(iter.hasNext()){
			String str = iter.next(); //하나 꺼내고 다음꺼 참조
			System.out.println(str);
		}

	}

}
