package com.tom;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter temperature(Celsius)");
		double c = scanner.nextDouble();
		Temperature t = new Temperature(c);
		Temperature k = new Temperature(c);
		//double f = c*(9.0/5.0)+32;
		System.out.printf("%.1f C = %.1f F,%.1f C = %.1f K", c,t.Fahrenheit(),c,t.Kelvin() );
	

	}

}
