package com.tom;

import java.util.Scanner;

public class Order {
	
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Please enter number of tickets:");
		int total = scanner.nextInt();
		System.out.println("How many round-trip tickets:");
		int rticket = scanner.nextInt();
		System.out.println("Total:");
		System.out.println("");
	}

}
