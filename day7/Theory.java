package com.day7;

public class Theory {
	


	public static void main(String[] args) {
		System.out.println(" what is the use of 'this' and 'super' keyword ? \n =================================================");
		
		System.out.println(" The 'this' keyword refers to the current object in a method or constructor."
				+ "\n The most common use of the this keyword is to eliminate the confusion between class attributes and parameters "
				+ "\n with the same name (because a class attribute is shadowed by a method or constructor parameter).\r\n"
				+ " =======================================================================");
		
		System.out.println(" The 'super' keyword refers to superclass "
				+ "(parent) objects. \n It is used to call superclass methods, and to access the superclass constructor."
				+ " \n The most common use of the 'super' keyword is to eliminate the confusion between superclasses and subclasses "
				+ "\n that have methods with the same name. "
				+ "\n ===========================================================");
		
		
	}
	
}

/// Examples this .............
class Mainff {
	  int x;

	  // Constructor with a parameter
	  public Mainff(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
	    Mainff myObj = new Mainff(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}

/// Example super ............
class Animal { // Superclass (parent)
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Dog extends Animal { // Subclass (child)
	  public void animalSound() {
	    super.animalSound(); // Call the superclass method
	    System.out.println("The dog says: bow wow");
	  }
	}

	class Mainf {
	   public static void main(String[] args) {
	      Animal myDog = new Dog(); // Create a Dog object
	      myDog.animalSound(); // Call the method on the Dog object
	   }
	}

