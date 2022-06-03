package com.day9;

public class Student {
	private int roll;
	private String name;
	private String grade;
	private int marks;
	
	public void displayDetails() {
		Student std1 = new Student();
		
		std1.setName("Shahil");
		std1.setRoll(1);
		std1.setMarks(560);
		char std1_grade = calculateGrade(std1.getMarks());
//		
//		System.out.println("Student 1- Name: " + std1.getName());
//		System.out.println("Student 1- Roll: " + std1.getRoll());
//		System.out.println("Student 1- Marks: " + std1.getMarks());
		
		System.out.println(std1.toString());
		System.out.println("Student 1- Grade: " + std1_grade);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		Student std2 = new Student();
		
		std2.setName("Sourav");
		std2.setRoll(6);
		std2.setMarks(460);
		char std2_grade = calculateGrade(std2.getMarks());
		
//		System.out.println("Student 2- Name: " + std2.getName());
//		System.out.println("Student 2- Roll: " + std2.getRoll());
//		System.out.println("Student 2- Marks: " + std2.getMarks());
		
		System.out.println(std2.toString());
		System.out.println("Student 2- Grade: " + std2_grade);
		
	}
	private char calculateGrade(int marks) {
		
		if(marks >= 500) {
			 return 'A';
		}else if (marks < 500 && marks >= 400) {
			return 'B';
		}else  {
			return 'C';
		}
		
		
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public Student() {};
	
	public Student(int roll, String name, String grade, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(char c) {
		this.grade = c;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}

class Main {
	/// Main method....
		public static void main(String[] args) {
			Student student = new Student();
			
			student.displayDetails();
			
		}
}


