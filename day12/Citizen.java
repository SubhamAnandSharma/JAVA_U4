package com.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.day4.demo;

public class Citizen {
	
	private String name;
	private String aadharNumber;
	private String mobileNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}

class Demo{
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		// I want to make this name to contain letters range from 3 to 8 only how do i do it????

/*--->*/boolean b1 =  Pattern.matches("[a-zA-Z]{3}", name);
		boolean b2 = Pattern.matches("[789]{1}[0-9]{9}", mobileNum);
		boolean b3 = Pattern.matches("[0-9]{12}", aadharCard);
		
//		System.out.println(b1 + " " + b2 + " " + b3);
		if(b1 && b2 && b3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Citizen ct = new Citizen();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name :");
		ct.setName(scanner.next());
		
		System.out.println("enter Mob number :");
		ct.setName(scanner.next());
		
		System.out.println("enter addhar number :");
		ct.setName(scanner.next());
		
		String nameString = ct.getName();
		String mobString = ct.getMobileNumber();
		String aadharsString = ct.getAadharNumber();
		
		boolean check = d1.validate(nameString, mobString, aadharsString);
				
		System.out.println("All the User Credential are correct : " + check);
	}
	
	
}
