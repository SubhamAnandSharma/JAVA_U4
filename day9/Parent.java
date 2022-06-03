package com.day9;

import java.util.Scanner;

public abstract class Parent {

	final int number = 56;
	
	public void method1() {
		
		System.out.println("Parent Class method1..");
	}
	public final void method2() {
		
		System.out.println("Parent Class method2..");

	}
	 abstract void method3();
	
	
}

 class Child extends Parent{
	
	@Override
	public void method1() {
		System.out.println("Child Class method1..");

	}
	
	//@Override   //Cannot override because in parent class this is a final method...
//	public final void method2() {
//		System.out.println("Child Class method2..");
//	}
	
	@Override /// 
	 void method3 (){
		System.out.println("Child Class method3..");
	}
	
	public void method4() {
		System.out.println("Child Class method4..");
	}
}

class MainP{
	
	public static void main(String[] args) {
		
		Child child = new Child();
		try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value from 1 to 10 :");
		child.number = scanner.nextInt();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		child.method1();
		child.method2();
		child.method3();
		child.method4();
		
		System.out.println(child.number);
		
	}
}