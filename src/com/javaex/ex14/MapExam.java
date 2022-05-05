package com.javaex.ex14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		map.put("001", "kang"); //key가 중복되면 새로운값으로 적용됨,값은 중복될 수 있음
		
		System.out.println(map.size()); //3
		System.out.println(map.get("001")); //kang
		System.out.println(map.get("002"));
		
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + value);
			
		}

	}

}
