package com.day3;
// Differance between Static and non-Static 

// In Static: when static function or static variable is created it directly loads or run on the 
// RAM and might get executed.
// On the other hand Non-Static variable or non-static function will not directly load on RAM.
// we have to change to the similar or compatible syntax in order for it to execute properly.

public class Stat {
	
	int a = 3; // this a non-static variable 
	
	static int b = 3;
	// we can just put static infront of the variable for it to work with other static function.
	
	public static void main(String[] args) {

		
		//System.out.println(a); this will through error.
		System.out.println(b);// 3
	}

}
