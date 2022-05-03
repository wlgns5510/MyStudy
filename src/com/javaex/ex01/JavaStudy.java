package com.javaex.ex01;

public class JavaStudy {

	public static void main(String[] args) {
		
//		int i = 10;
//		int j = 0;
//		try {
//			int k = i/j;
//			System.out.println(k);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다." + e.toString());
//		}
//		finally {
//			System.out.println("오류가 발생했든 발생하지 않았든 실행!!");
//		}
//		System.out.println("main end!!");
		
		        int [] array = new int[10];
		        try {
		            array[20] = 5; 
		        }
		        catch(java.lang.ArrayIndexOutOfBoundsException e) {
		        	System.out.println("20을 배열에 넣을 수 없습니다.");
		        }
		        finally {
		        	System.out.println("오류가 있든 없든 실행되는 블록");
		        }
		        
		        
		    
		
	}

}
