package com.day4;

import java.util.Scanner;


public class PojoEmployee {

//	private int employeeId;
//	private String employeeName;
//	private double salary;
//	private double netSalary;
	
	
	void employeeDetails(int salary,String name,int id){
		System.out.println("Salary :" + salary );
		System.out.println("Employee Name :" + name );
		System.out.println("Employee Id :" + id );
		
		

	}
	
	void getPFPercentage(int pf, int salary) {
		
		double cal = salary-salary*pf/100;
		System.out.println("Net Salary :" + cal);
	}
	

	public static void main(String[] args) {
		
	// Java Beans;
	PojoEmployee obj= new PojoEmployee();
	
	
	// Java input scanner;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Employee Name :" );
	String name = scanner.next();
	
	System.out.println("Enter Id :" );
	int id = scanner.nextInt();
	
	System.out.println("enter salary : ");
	int salary = scanner.nextInt();
	
	System.out.println("pfPercentage :" );
	int pf = scanner.nextInt();
	

	
	obj.employeeDetails(salary,name,id);
	
	obj.getPFPercentage(pf,salary);
	
	}
	
	
	
	
//	public int getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}

//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//	
}
