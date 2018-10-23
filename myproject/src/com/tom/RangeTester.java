package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Import one int number(3~5)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean number = line.equals("3")||line.equals("4")||line.equals("5");
		System.out.println(number);
		
	}
}
