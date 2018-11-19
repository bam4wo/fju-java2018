package com.tom;

import java.util.Scanner;

public class Order {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int all = 1;
		while(all != 0) {
			System.out.print("Please enter number of tickets: ");
			int total = scanner.nextInt();
			scanner.nextLine();
			if(total != -1) {
				System.out.print("How many round-trip tickets: ");
				int rticket = scanner.nextInt();
				Ticket r = new Ticket(rticket);
				Ticket t = new Ticket(total - rticket);
				System.out.println("Total tickets:" + total);
				System.out.println("Round-trip:" + rticket);
				System.out.println("Total:" + (t.onePrice()+r.rPrice()));
			}else {
				break;
			}
		}
		
		
	}

}
