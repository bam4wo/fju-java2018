package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Import one int number(-3~5)");
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		boolean number = line>=-3 && line<=5;
		System.out.println(number);
		
	}
}
