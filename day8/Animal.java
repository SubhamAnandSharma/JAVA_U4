package com.day8;

public class Animal {


		public void makeNoise() {
		System.out.println("Animal making Noise");
		} 
		
		public void eat(){
		System.out.println("Animal is eating");
		}
		
		public void walk(){
		System.out.println("Animal is walking");
		}
		
}

class Dog extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Barking... ");
	}
}

class Cat extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Meaw... ");
	}
}

class Tiger extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Roaring... ");
	}
}

class MainA{
	
	public static void main(String[] args) {
		//create an array of Animal class with size 3
		//initialize all 3 elements of this Animal class
		//with //Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		
		Animal[] a = new Animal[3];
		
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Tiger();
		
		for(int i = 0;i<a.length; i++) {
			
			System.out.println(a[i].eat());
			System.out.println(a[i].makeNoise());
			System.out.println(a[i].walk());
			
			System.out.println("++++++++++++++++++++++++++++++++++++");
		}
		
	}
	
}
