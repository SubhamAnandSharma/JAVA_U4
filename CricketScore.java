package com.masai;

//import java.lang.invoke.VarHandle;

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		totalScore(1,2,3,4,6);
	}
	public static void totalScore(int single,int doubles, int triple,int four,int six) {
		
		int total = single + doubles + triple + four + six;
		
		System.out.println(total);
	}
}
