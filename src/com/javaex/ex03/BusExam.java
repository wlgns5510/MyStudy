package com.javaex.ex03;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
		//c.ppangppang(); //부모인 Car가 Bus를 가리키고 있기때문에 사용할수없다
		
		Bus bus = (Bus)c; //ppangppang메소드를 사용하기 위해서 형변환
		bus.run();
		bus.ppangppang();
		
		//부모가 자식을 가리킬수는 있지만, 부모가 가리키고 있을때에는 부모갖고 있는 메소드들만 사용가능 --> 사용하기 위해서 형변환이 필요함
		
		
		
		

	}

}
