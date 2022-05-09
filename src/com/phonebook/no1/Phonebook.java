package com.phonebook.no1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {

	public static void main(String[] args) throws IOException {
		
		List<Person> personList = new ArrayList<Person>();
		
		Reader re = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(re);
		
		while(true) {
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			String[] personInfo = str.split(",");
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			Person person = new Person(name, hp, company);
			
			personList.add(person);						
		}
		Person p1 = new Person("양지훈", "010-7920-5514", "02-596-5514");
		personList.add(p1);
		
		for(Person person : personList) {
			System.out.println("이름: " + person.getName());
			System.out.println("핸드폰: " + person.getHp());
			System.out.println("회사: " + person.getCompany());
			System.out.println("");
		}
		
		Writer wr = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wr);
		
		for(Person person : personList) {
			String saveStr = person.getName() + "," + person.getHp() + "," + person.getCompany();
			System.out.println(saveStr);
			
			bw.write(saveStr);
			bw.newLine();
			
		}
		bw.close();
		br.close();
	}	
}
