package com.day11;

public interface X {
	
	public void lottary();
	default void methodX1() {
		System.out.println("Inside intr X mthd 1");
	}
	static void methodX2() {
		System.out.println("Inside intr X mthd 2");

	}
	
	
}
