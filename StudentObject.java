package com.day3;

public class StudentObject {
	
	String name;
	int rollNo = 02;
	int marks = 72;
	
	void displayStudentDetails() {
		
		System.out.println("Name is: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Marks is: "+ marks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentObject s1 = new StudentObject();
		
		s1.name = "Ravi Shankar Sharma";
		s1.rollNo = 01;
		s1.marks = 89;
		
		s1.displayStudentDetails();
		
		StudentObject s2 = new StudentObject();
		
		s2.name = "Chandra Shekhar Sharma";
		s2.rollNo = 02;
		s2.marks = 73;
		
		s2.displayStudentDetails();
		
		s1 = null; // now these objects are available for the garbage collectors.
		s2 = null; 
//		s1.displayStudentDetails(); 

		
	}

}
