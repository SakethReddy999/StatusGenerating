package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.TicketService;



public class TicketUI {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ticketid");
		int ticketid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter no of seats");
		int noOfSeats=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the seatName");
		String seatName=sc.next();
		sc.nextLine();
		System.out.println("enter the ticketstatus");
		String ticketStatus=sc.next();
		sc.nextLine();
		System.out.println("enter the screen name");
		String screenName=sc.next();
		sc.nextLine();
		TicketService ticketService=new TicketService(); 
		int updateCount=ticketService.addTicket(ticketid,noOfSeats,seatName,ticketStatus,screenName);
		System.out.println(updateCount);
	}
}
