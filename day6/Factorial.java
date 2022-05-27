package com.day6;

public class Factorial {

	public void findFactors(int num) {
		int multi = 1;
		
		for(int i = 5; i >= 1;i--) {
			multi = multi*i;
		}
		
		System.out.println(multi);
	}
	
	public void findFactors(int num1, int num2) {
		int f = num1 - num2;
		f = Math.abs(f);
		
		int multi = 1;
		
		for(int i = f; i >= 1;i--) {
			multi = multi*i;
		}
		
		System.out.println(multi);
	}
	
	public static void main(String[] args) {
		
		Factorial fac = new Factorial();
		
		fac.findFactors(5);
		fac.findFactors(7,11);
//		fac.findFactors(0, 0,0,1);
		
		
	}
}
