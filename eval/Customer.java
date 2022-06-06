package week3.eval;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {

	private String userName;
	private String password;
	private String mobileNumber;
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(String userName, String password, String mobileNumber, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	
}

class Demo1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userName , password , mobileNumber, email :");
		String us = sc.next();
		String pass = sc.next();
		String mob = sc.next();
		String email = sc.next();

		System.out.println(Pattern.matches("[a-zA-Z]{3,8}", us));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3,8}", pass));
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", mob));
		System.out.println(Pattern.matches("[com]{3}", email));
		if(Pattern.matches("[a-zA-Z]{3,8}", us)&& Pattern.matches("[a-zA-Z][0-9]{3,8}", pass)&& Pattern.matches("[6789]{1}[0-9]{9}", mob)&& Pattern.matches("[com]{1}", email)) {
			Customer c1 = new Customer(us, pass, mob, email);

			System.out.println(c1.getEmail());
			System.out.println(c1.getUserName());
			System.out.println(c1.getPassword());
			System.out.println(c1.getMobileNumber());
		}else {
			System.out.println("print the appropriate validation error message.");
		}

		
		
	}
}
