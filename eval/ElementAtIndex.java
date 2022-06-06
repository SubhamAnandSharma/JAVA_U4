package week3.eval;

import java.util.Scanner;

public class ElementAtIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int val = sc.nextInt();
		
		int[] arr = new int[val];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the elements in the array");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		System.out.println("The array element at index " + index + " = " + arr[index]);
		System.out.println("The array element successfully accessed");
	}
}
