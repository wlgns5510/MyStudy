package com.javaex.ex11;

public class Box<E> { //E는 정해진건 아님, 실제로 존재하는 타입은 아님
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
	
}
