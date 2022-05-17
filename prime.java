package com.masai;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		
		for (int i=2; i<=n;i++) {
			if(n%i==0) {
				System.err.println(i);
			}
		}
	}

}
