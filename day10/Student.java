package com.day10;

import java.util.Scanner;

public abstract class Student {
	
	String name;
	String address;
	
	abstract double getPercentage();
	

	public Student() {}

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
}

class ScienceStudent extends Student{

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;


	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	@Override
	double getPercentage() {
		
		int total = physicsMarks+chemistryMarks+mathsMarks;
		System.out.println(total);
//		double outOfHundred = total/300;
//		System.out.println(outOfHundred);
		int percentage = (total/300)*100;
		System.out.println(percentage);
		return percentage;
	}
	
}

class HistoryStudent extends Student{
	
	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}


	public int getHistoryMarks() {
		return historyMarks;
	}


	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	public int getCivicsMarks() {
		return civicsMarks;
	}


	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}


	@Override
	double getPercentage() {
		// TODO Auto-generated method stub

		int total = historyMarks+civicsMarks;
		int percentage = (total/200)*100;
		return percentage;
		
		
	}
	
	
}

class AllStudents{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name and address :");
		ScienceStudent ss = new ScienceStudent(sc.next(), sc.next());
				
//		System.out.println("enter name :");
//		ss.name = sc.next();
//		System.out.println("enter address :");
//		ss.address = sc.next();
		System.out.println("enter chemistry marks :");
		ss.setChemistryMarks(sc.nextInt());
		System.out.println("enter Math marks :");
		ss.setMathsMarks(sc.nextInt());;
		System.out.println("enter physics marks :");
		ss.setPhysicsMarks(sc.nextInt());;
		
		System.out.println("Name : " + ss.name + "Address : " + ss.address);
		System.out.println("Marks in Chemistry = " + ss.getChemistryMarks());
		System.out.println("Marks in Maths = " + ss.getMathsMarks());
		System.out.println("Marks in Physics = " + ss.getPhysicsMarks());
		double percent = ss.getPercentage();
		System.out.println("total percentage : "+percent);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("enter name and address :");
		HistoryStudent hs = new HistoryStudent(sc.next(), sc.next());

		System.out.println("enter Civics marks :");
		hs.setCivicsMarks(sc.nextInt());
		System.out.println("enter History marks :");
		hs.setHistoryMarks(sc.nextInt());;
		
		
		System.out.println("Name : " + hs.name + "Address : " + hs.address);
		System.out.println("Marks in Civics = " + hs.getCivicsMarks());
		System.out.println("Marks in History = " + hs.getHistoryMarks());
		double percent1 = hs.getPercentage();
		System.out.println("total percentage : "+percent1);
		
		
		
	}
}