package com.day7;

public class Student {

	int studId;
	String studName;
	double examFee;
	
	void displayDetails() {
		
	}
	
	double payFee(int paid, int otherCharge){
		
		double remain = (examFee + otherCharge) - paid;
		
		return remain;
	}

	public Student() {}

	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
}

class DayScholar extends Student{
	
	double transportFee;
	
}

class Hosteller extends Student{
	
	double hostelFee;
	
}

class Mainf{
	
	public static void main(String[] args) {
		
		DayScholar shc = new DayScholar();
		Hosteller host = new Hosteller();
		
		// DayScholar....
		shc.setStudName("Gajendra Prasad"); 
		shc.setStudId(8225);
		shc.setExamFee(1000);
		double transport = shc.transportFee = 400;
		int shPaid = 1200;
		
		double result = shc.payFee(shPaid, (int)transport);
		
		System.out.println("Scholar Name : " + shc.getStudName());
		System.out.println("Scholar id : " + shc.getStudId());
		System.out.println("Scholar Exam Fee : " + shc.getExamFee());
		System.out.println("Transportation Charges : " + transport);
		System.out.println("Amount Paid : " + shPaid);

		System.out.println("Remain Balance to be paid : " + result);
		
		System.out.println("==============================================");
		// Hosteller.....

		host.setStudName("Gajendra Prasad"); 
		host.setStudId(8005);
		host.setExamFee(1000);
		double htFee = host.hostelFee = 1200;
		int htPaid = 1600;
		
		double result1 = host.payFee(htPaid, (int)htFee);
		

		System.out.println("Hosteller Name : " + host.getStudName());
		System.out.println("Hosteller id : " + host.getStudId());
		System.out.println("Hosteller Exam Fee : " + host.getExamFee());
		System.out.println("Hostel Rental Fee : " + htFee);
		System.out.println("Amount Paid : " + htPaid);
		
		System.out.println("Remain Balance to be paid : " + result1);

	}
}
