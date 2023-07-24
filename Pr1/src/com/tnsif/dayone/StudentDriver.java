//Program to demonstrate Driver class for Student Entity
package com.tnsif.dayone;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student(); //default constructor
		s1.rollNo=41;
		s1.name="Kumar";
		s1.m1=66;
		s1.m2=88;
		s1.m3=95;
		s1.show();
		System.out.println(s1);
		Student s2=new Student(20, "Akash", 80, 90, 85); //parameterized constructor
		s2.show();
				
	}

}