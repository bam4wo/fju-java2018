package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GueesNum secert = new GueesNum();
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
		}*/
		
		Random random = new Random();
		int secret = random.nextInt((10)+1);
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		/*while(count > 0 && count <= 4){
			System.out.println("your guess ("+ count+"/4)"+":" );
			int n = scanner.nextInt();
			count++;
			if(n < secret){
				System.out.println("higher");
			}else if(n > secret){
				System.out.println("lower");
			}else{
			    break;
			}	
		}
		if (count > 2 && count <= 4){
			System.out.printf("Great! The secret number is  " + secret);
		}else{
			System.out.print("Excellent!The secret number is " + secret);
		}*/
		
		for(int i = 1 ; i<=4 ; i++){
			System.out.println("your guess("+i+"/4) :");
			count = scanner.nextInt();
			if(count > secret){
				System.out.println("lower");
			}else if(count < secret){
				System.out.println("higher");
			}
		}
	}

}
