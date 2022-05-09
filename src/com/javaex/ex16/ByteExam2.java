package com.javaex.ex16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis(); //현재시간을 long타입으로 반환해주는 매서드
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/com/javaex/ex16/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, readCount);
			}
				
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime); //byte 사용으로 처리하는 속도가 빨라짐

	}

}
