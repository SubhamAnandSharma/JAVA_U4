package com.day7;

import javax.print.attribute.standard.MediaSize.Engineering;

public class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	public void printSalary() {
		System.out.println("Salary : " + salary);
	}
	
	
}

class Employee extends Member{
	
	String Specialisation;
	String Department;
	
}

class Manager extends Member{
	
	String Specialisation;
	String Department;
	
}

class Main{
	
	public static void main(String[] args) {
		
		Manager man = new Manager();
		Employee emp = new Employee();
		
		// Employee Details.........
		emp.name = "Sachin";
		emp.age = 26;
		emp.address = "WB";
		emp.phoneNumber = "8550077777";
		emp.salary = 50000;
		emp.Specialisation = "Engineering";
		emp.Department = "IT";
		
		
		System.out.println("Employee Name :" + emp.name);
		System.out.println("Employee age :" + emp.age);
		System.out.println("Employee address :" + emp.address);
		System.out.println("Employee mobile number :" + emp.phoneNumber);
		System.out.println("Employee salary :" + emp.salary);
		System.out.println("Employee Specialisation :" + emp.Specialisation);
		System.out.println("Employee Department :" + emp.Department);
		
		System.out.println("=================================================");
		
		// Manager Details............
		man.name = "Ravi Shekhar";
		man.age = 32;
		man.address = "WB";
		man.phoneNumber = "8550077889";
		man.salary = 150000;
		man.Specialisation = "Computer Engineering";
		man.Department = "Manager";
		
		
		System.out.println("Employee Name :" + man.name);
		System.out.println("Employee age :" + man.age);
		System.out.println("Employee address :" + man.address);
		System.out.println("Employee mobile number :" + man.phoneNumber);
		System.out.println("Employee salary :" + man.salary);
		System.out.println("Employee Specialisation :" + man.Specialisation);
		System.out.println("Employee Department :" + man.Department);
		
		System.out.println("=================================================");

		man.printSalary();
		emp.printSalary();
 	}
}
