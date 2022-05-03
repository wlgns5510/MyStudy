package com.javaex.ex01;

public class star {

	public static void main(String[] args) {
		
		
		for(int i = 0; i<5; i++) {			
			for(int j = 1; j<5-i; j++) {												
				System.out.print(" ");
			}
			for(int p=0; p<i*2+1; p++) {
			System.out.print("*");	
			}
			System.out.println();
		}

	}
}
