package com.javaex.ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {
		//데코레이터 패턴 --> 서브클래스를 통해 기능을 유연하게 확장, 객체에 추가적인 기능을 추가
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 한줄씩 입력 //System.in는 키보드를 의미
		String line = null; //변수 선언을 try밖에서 해줘야 사용하기 편함
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(line); //System.in으로 입력받은 line을 출력
	}

}
