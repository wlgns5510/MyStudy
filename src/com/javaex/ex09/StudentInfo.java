package com.javaex.ex09;

class StudentInfo {
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}
class StudentPerson{
	public StudentInfo info;
	StudentPerson(StudentInfo info){
		this.info = info;
	}
}



class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}
class EmployeePerson{
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){
		this.info = info;
	}
}



