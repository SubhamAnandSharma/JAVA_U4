package com.day11;

public interface Z extends X,Y{
	
	abstract void showTheTicket();
	
}

class Zimpl implements Z{

	@Override
	public void lottary() {
		// TODO Auto-generated method stub
		System.out.println("lottary amt 100K ");

		
	}

	@Override
	public void wonALottary() {
		// TODO Auto-generated method stub
		System.out.println(" Congratulation you just won lottary amt 100K ");

	}

	@Override
	public void showTheTicket() {
		// TODO Auto-generated method stub
		System.out.println("lottary Ticket 10K56MN500 ");

		
	}
	
	public static void main(String[] args) {
		
		Zimpl zi = new Zimpl();
		
		zi.showTheTicket();
		zi.lottary();
		zi.methodX1();
		zi.methodY1();
		zi.wonALottary();
		/// how to call the static method from another class or interface.
		
	}
}

