package com.day4;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] std1 = new Student[3];
		
//		System.out.println(std[0]);
		
		std1[0] = new Student(1,"Mohit","UP",790);
		std1[1] = new Student(2,"Raghav","MP",678);
		std1[2] = new Student(3,"Shouvik","WB",880);
		
//		for(int i = 0;i< std1.length;i++) {
			
//			System.out.println("Student Name :" + std1[i].getName());
//			System.out.println("Roll No. :" + std1[i].getRoll());
//			System.out.println("Address :" + std1[i].getAddress());
//			System.out.println("Marks :" + std1[i].getMarks());
//			
//			System.out.println("======================================");

//		}
		
		for(Student std: std1) {
			
			System.out.println("Student Name :" + std.getName());
			System.out.println("Roll No. :" + std.getRoll());
			System.out.println("Address :" + std.getAddress());
			System.out.println("Marks :" + std.getMarks());
			
			System.out.println("======================================");
		}

	}

}

class Student{
	
	int roll;
	String name;
	String address;
	int marks;
	
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	public Student() {}
	
	public Student(int roll, String name, String address, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	
}
