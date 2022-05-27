package com.day6;

import java.util.Scanner;

public class Array {

	public static String reverseString(String original) {
		System.out.println("hello from function " + original.length());
		String bagString = "";
		for(int i = original.length()-1;i>=0;i--) {
			bagString += original.charAt(i);
		}
		return bagString;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a string here :");
		String originalString = sc.next();
		
		String reversedStr =  reverseString(originalString);
		
		System.out.println("original string : " + originalString);
		System.out.println("reversed string : " + reversedStr);
	}
}
