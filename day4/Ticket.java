package com.day4;

import java.io.Console;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;


public class Ticket {

	private int ticketId;
	private int price;
	static int availableTickets = 25;
	
	public int calculateTicketCost( int bookT ) {
		
		
		setPrice(100);
		int price = getPrice();
		setTicketId(111);
		System.out.println("Ticket Id :" + getTicketId());
		
		System.out.println("Available Tickets :" + availableTickets);
		if(availableTickets >= bookT) {
			price = price*bookT;
			
		}else {
			return -1;
		}
		
		availableTickets = availableTickets-bookT;
		System.out.println("Available Tickets after booking:" + availableTickets);
		
		return price;
	}

	public static void main(String[] args) {
		
		// helper Objects;
		Ticket t = new Ticket();
		Scanner scanner = new Scanner(System.in);

		// Taking help...
		System.out.println("Required Tickets :");
		int bookT = scanner.nextInt();
				
		
		int price = t.calculateTicketCost( bookT );
		System.out.println("no. of tickets required :" + bookT);
		System.out.println("Total Price :" + price);
		
		
		
		
		
	}

	
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
