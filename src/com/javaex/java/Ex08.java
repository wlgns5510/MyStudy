package com.javaex.java;

import java.util.HashSet;

public class Ex08 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(5);	//중복값을 들어가지 않는다
		
		set.remove(5);
		
		if(set.contains(2)) {
			System.out.println("해당 숫자가 있습니다.");
		}
		else {
			System.out.println("해당 숫자가 없습니다.");
		}

	}

}
