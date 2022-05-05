package com.javaex.ex10;

public class BoxExam {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("Hello"); //Object 타입이라 Stirng 사용불가
		String str = (String)box.getObj(); //String래핑클래스를 이용함
		System.out.println(str);
		
		box.setObj(1);
		int num = (Integer)box.getObj(); //Object 타입이라 int 사용불가
		System.out.println(num); //Integer래핑클래스를 이용함
		
		//사용할때마다 Object타입이라 원하는값을 넣고싶을때 래핑이 필요해서 불편함

	}

}
