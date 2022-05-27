package com.day4;

import java.io.Console;
import java.util.Scanner;

public class Account {
	
	private int accId;
	private String accType;
	private int balance;
	

	public int getAccId() {
		return accId;
	}


	public void setAccId(int accId) {
		this.accId = accId;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public boolean withdraw(int withdraw,int bal) {
		
		if(bal > withdraw) {
			int left = bal - withdraw;
		System.out.println("Balance after withdraw :" + left);
		
		}
		else {
			System.out.println("Sorry!!! Not Enough Balance");
		}
		return true;
	}

}

class AccountDetails {
	
	public Account getAccountDetails(Account acc) {
		
		if(acc.getBalance() <= 0) {
			System.out.println("Balance should be positive.");
		}else {

			System.out.println("Your Account Id :"+ acc.getAccId());
			System.out.println("Account Type :"+ acc.getAccType());
			System.out.println("Account Balance :"+ acc.getBalance());
			
		}
		
		return acc;
	}
	
	public int getWithdrawAmount(Account acc) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account to be withdraw :");
		int wit = scanner.nextInt();
		int bal = acc.getBalance();
		
		boolean isAvail= acc.withdraw(wit,bal);

		return bal-wit;
	}
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Account Id :");
		int id = scanner.nextInt();

		System.out.println("Enter Account type :");
		String type = scanner.next();
//
		System.out.println("Enter Account balance :");
		int bal = scanner.nextInt();
		
//		
		acc.setAccId(id);
		acc.setAccType(type);
		acc.setBalance(bal);
//		
		
		
//		boolean isAvail= acc.withdraw(wit,bal);
		AccountDetails ad = new AccountDetails();

		ad.getAccountDetails(acc);
		ad.getWithdrawAmount(acc);
	}
}


