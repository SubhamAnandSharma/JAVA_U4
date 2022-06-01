package com.day8;
/*
 * ClassCastException is a runtime exception raised in Java
 *  when we try to improperly cast a class from one type to another.
 *  It's thrown to indicate that the code has attempted to cast an object to a related class,
 *   but of which it is not an instance.
 */
public class ClassCastException {

	public static void main(String[] args) {
		
	//Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance. For example, the following code generates a ClassCastException:
		     Object x = new Integer(0);
		     System.out.println((String)x);
	}
}
