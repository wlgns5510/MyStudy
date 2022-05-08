package com.javaex.ex16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/com/javaex/ex16/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) {
				fos.write(readData);
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

	}

}
