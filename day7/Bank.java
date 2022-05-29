package com.day7;

import java.util.Scanner;

//Create a Demo class and define the following method:
//public static Bank getBank(String bank);
//implement the above method such as if we supply “axis” then it should return
//Axis bank object and if supply “icici” then it should return ICICI bank object
//and if we supply any invalid value then it should return null.
//Note: returned bank object should have all the details.Call the above method
//from the main method of Demo class by taking input from the user and
//print the Bank details by calling displayDetails() method. If the returned bank
//object is Axis bank then call the getCreditCard() method.
public class Bank {

	String branchName;
	String ifscCode;
	
	void displayDetails(){
		System.out.println("Override : " + this.branchName + " in subClass.");
		System.out.println("Override : " + this.ifscCode + " in subClass.");
	}
	
}

class AxisBank extends Bank{
	double rateOfInterest = 7;

	@Override
	void displayDetails() {
		this.branchName = "Axis Bank";
		this.ifscCode = "AXBN00059";
		
		System.out.println("Bank Name : " + branchName);
		System.out.println("Bank Ifsc Code : " + ifscCode);
		System.out.println("Bank Rate Of Interest : " + rateOfInterest);
		System.out.println("=======================================================");
		
	}
	
	void getCreditCard() {
		
		System.out.println("Get the Credit Card from the Axis bank");
		
	}
}

class ICICIBank extends Bank{
	
	double rateOfInterest = 6;
	

	@Override
	void displayDetails() {
		
	this.branchName = "ICICI Bank";
	this.ifscCode = "ICIBN00084";
	
	System.out.println("Bank Name : " + branchName);
	System.out.println("Bank Ifsc Code : " + ifscCode);
	System.out.println("Bank Rate Of Interest : " + rateOfInterest);
	System.out.println("==============================================================");
	
	}
}

class Demo{
	
	public static Bank getBank(String bank) {
		Bank ax = new AxisBank();
		Bank ic = new ICICIBank();
		
		
		if("axis".equals(bank)) {
			return (Bank) ax;
			Bank ax = (ax) AxisBank();
			
			
		}else if ("icici".equals(bank)) {
			return (Bank) ic;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the bank name axis or icici to get the details");
		String bankName = scanner.next();
		
		Bank bn = getBank(bankName);
		
		bn.displayDetails();
	}
}
