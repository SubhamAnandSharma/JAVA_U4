package com.day3;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		try (
		Scanner scanner = new Scanner(System.in))
		
		{
			System.out.println("enter number between 2 - 100 :");
			int n = scanner.nextInt();
			
			if(n<2 || n>100) {
				System.out.println("Invalid number!");
			}else {
			for (int i=2; i<=n;i++) {
				if(n%i==0) {
					System.err.println(i);
				}
			}
			}
		}
		
		
	}
}
