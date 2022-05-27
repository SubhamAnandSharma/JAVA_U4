package com.day6;

public class Main{
	
public boolean checkPrime(int num) {
	
	int count = 0;
	for(int i =1; i<=num; i++) {
		
		if(num%i==0) {
			count++;
		}
	}
	
	if(count == 2) {
		return true;
	}else {
		return false;
	}
}
	
public int[] findAndReturnPrimeNumbers(int[] inputArray){
	
	int[] newArr = new int[inputArray.length];
	
	for(int i = 0; i< inputArray.length; i++) {
//		System.out.println(inputArray[i]);
		if(checkPrime(inputArray[i])) {
//			System.out.println("isPrime!");
			newArr[i] = inputArray[i];
		}else {
//			System.out.println("notPrime!");
		}
	}
	
	for(int i = 0; i< inputArray.length; i++) {
		
		if(newArr[i] != 0) {
			return newArr;
		}		
	}
	
	newArr = null ;
	
	
	return newArr;
//write the logic to iterate through the supplied inputArray and
//determine each element whether it is prime or not
//create a second array of int
//if any number is prime inside the inputArray then add that number inside the second
//array
//and return the second array
//if no prime number is found then return the empty array.
}
public static void main(String[] args){
//Create the object of Main class
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
Main main = new Main();

int[] arr = {10,12,5,50,7,14,11};

int[] result = main.findAndReturnPrimeNumbers(arr);

if(result == null) {
	System.out.println("Prime number not found in the supplied Array");
}else {
	for(int i = 0; i< result.length; i++) {

		if(result[i] != 0) {
			System.out.println(result[i] + " Is a Prime Number!");
		}
	}
}


//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following
//message:
// "Prime number not found in the supplied Array"
}
}
