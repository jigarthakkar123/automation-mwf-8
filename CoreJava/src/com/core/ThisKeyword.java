package com.core;

class Student
{
	String sname;
	int rno;
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(String sname,int rno) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Student s1=new Student("Jigar",101);
	}
}
