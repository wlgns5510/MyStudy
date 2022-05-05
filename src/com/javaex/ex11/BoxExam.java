package com.javaex.ex11;

public class BoxExam {

	public static void main(String[] args) {
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		
		

	}

}
