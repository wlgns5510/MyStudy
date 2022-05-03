package com.javaex.ex08;

public class AccessObjExam {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p);
		System.out.println(obj.p2);
		System.out.println(obj.p3);
		System.out.println(obj.getP4()); //private는 gs가 필요함

	}

}
