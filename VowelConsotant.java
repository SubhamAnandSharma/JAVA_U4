package com.day3;

public class VowelConsotant {
	
//	void availability(String val) {
//		Array allChar= "abcdefghijklmnopqrstuvwxyz";
//		for(int i=0;i<allChar.length();i++) {
//			if (allChar[i]==val) {
//				return true;
//			}
//		}
//	}
	void check(String charactor) {
		
//		availability(charactor);
		if(charactor == "a" ||charactor == "e" ||charactor == "i" ||charactor == "o" ||charactor == "u") {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g = "ahalk";
		VowelConsotant v1 = new VowelConsotant();
		v1.check("h");
	}

}
