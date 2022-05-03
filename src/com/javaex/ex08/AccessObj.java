package com.javaex.ex08;

public class AccessObj {
	public int p = 3; 		//public은 모두 가능
	protected int p2 = 4; 	//같은 패키지, 다른패키지라고 상속관계의 자식에게는 접근가능	
	int p3 = 2; 				//디폴트 접근지정자, 자기자신과 같은 패키지만 접근가능
	private int p4 = 1; 	//자기자신만 접근가능
	
	public int getP4() {
		return p4;
	}
	public void setP4(int p4) {
		this.p4 = p4;
	}
	
	
}
