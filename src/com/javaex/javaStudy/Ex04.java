package com.javaex.javaStudy;
class ClassName<E>{
	
	private E element;	//제네릭 타입 변수 설정

	//메소드gs
	public void setElement(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}
	
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		ClassName<String> a = new ClassName<String>();
		ClassName<Integer> b = new ClassName<Integer>();
		
		a.setElement("10");	//String타입
		b.setElement(10);	//Integer타입
		
		System.out.println("a의 값: " + a.getElement());	//a의 값
		System.out.println("a의 타입: " + a.getElement().getClass().getName());	//a의 타입
		
		System.out.println("-----------------------------------");
		
		System.out.println("b의 값: " + b.getElement());  //b의 값
		System.out.println("b의 타입: " + b.getElement().getClass().getName());

	}

}
