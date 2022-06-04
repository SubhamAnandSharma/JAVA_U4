package com.day10;

import java.util.Scanner;

public interface Hotel {

	void chickenBiryani();
	void masalaDosa();
	
}



class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Biryani from Taj Hotel..");
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa from Taj Hotel..");

	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
	
}


class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Biryani from Road Side Hotel..");

	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa from Road Side Hotel..");

	}
	
}


class Demo{
	
	public Hotel provideFood(int amount) {
		
		if(amount > 1000) {
			return new TajHotel();
		}else if(amount > 200 && amount < 1000) {
			return new RoadSideHotel();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		int amount = scanner.nextInt();
		
		Demo d1 = new Demo();
		
		Hotel h1 =  d1.provideFood(amount);
		
		if(h1 instanceof TajHotel) {
			TajHotel t = (TajHotel)h1;
			t.chickenBiryani();
			t.masalaDosa();
			t.welcomeDrink();
			
		}else if (h1 instanceof RoadSideHotel) {
			RoadSideHotel r = (RoadSideHotel) h1;
			r.chickenBiryani();
			r.masalaDosa();
		} 
		
	}
}
