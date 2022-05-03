package com.javaex.ex07;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		
		Car bus1 = new Bus();
		bus1.run();
		
		Car car = new Car();
		car.run();
		
		//car.ppangppang(); //부모는 자식이 가진 메소드를 사용할 수 없다.
		
		

	}

}
