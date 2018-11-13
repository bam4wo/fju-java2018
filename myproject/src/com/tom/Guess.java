package com.tom;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GueesNum secert = new GueesNum();
		Scanner scanner = new Scanner(System.in);
		int diff = -1;
		while (diff != 0) {
			System.out.println("your guess");
			int number = scanner.nextInt();
			diff = secert.guess();
			if(diff > 0){
				System.out.println("lower");
			}else if (diff == 0){
				System.out.println("Great! The secret number is" + secert.guess());
			}else{
				System.out.println("higher");
			}
		}
		
	}

}
