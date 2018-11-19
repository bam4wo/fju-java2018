package com.tom;

public class Ticket {
	int price = 1000;
	int ticket;
	
	public Ticket(int ticket) {
		this.ticket = ticket;
	}
	
	public int onePrice() {
		int onePrice = ticket*price;
		return onePrice;
	}
	
	public int rPrice() {
		int rPrice = (int)(ticket*price*2*0.9);
		return rPrice;
	}
	

}
