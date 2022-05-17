package com.masai;

public class Swth {
		
		public static void main(String[] args) {
//			System.out.println("hello");
			
			
			String city = "Mumbai";
			
			switch(city) {
			case "Mumbai": 
				System.out.println("Financial city");
				break;
			case "Kolkata":
				System.out.println("City of Joy");
				break;
			case "Delhi":
				System.out.println("Capital of the Country");
				break;
			case "Bangalore":
				System.out.println("Cyber City");
				break;
			default:
				System.out.println("May be Other Indian City");
				break;
			}
			
			
		}
}
