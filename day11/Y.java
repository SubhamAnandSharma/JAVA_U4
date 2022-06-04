package com.day11;

public interface Y {
	
	public void wonALottary();
	default void methodY1() {
		System.out.println("Inside intr Y mthd 1");

	}
	static void methodY2() {
		System.out.println("Inside intr Y mthd 2");
	}
	
}
