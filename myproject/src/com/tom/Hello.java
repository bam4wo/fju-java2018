package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<5 ; i=i+1);
	    
		
		/*Random random = new Random();
		int secret = random.nextInt((100)+1);
		System.out.println(secret);*/
		
		/*int b = 1;
		while(b>0){
			System.out.println("1-100");
			b = b-1;
		}*/
		
		
		
		/*int n = (int)(3/5.0);
		System.out.println(n);
		int v = 5/3;
		int m = 5%3;
		System.out.println(v);
		System.out.println(m);
		int a = 5;
		float age = 7.10835f;
		String nick = "Tom";
		System.out.printf("Hi, %s, Your age: %.2f, Your love number: %d\n", nick , age, a);*/
		
		double c = 24.0;
		System.out.println();
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("C?");
	    double cold = scanner.nextDouble();
	    System.out.println(cold*(9.0/5)+32);
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("You name:");
		String name = scanner.nextLine();
		System.out.println(name);*/
		
		Student stu = new Student("Hank",70,90);
		stu.print();
		System.out.println(3 > 5);
		System.out.println(3 == 5);
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		
		/*stu.name = "Hank";
		stu.english = 70;
		stu.math = 90;*/
		
		
		Person p = new Person(68.5f, 1.7f);
		//p.weight = 65.5f;
		//p.height = 1.7f;
		System.out.println(p.bmi());
		p.hello();
		//Person hank = new Person();
		//Person jack = null;
		//jack.hello();
		
		/*System.out.println("Hello world");
		int age = 18 ;
		int schoolYear = 107;
		int birthday = 727;
		int loveNumber = 10;
		float weight = 60.5F;
		float height = 1.7f;
		String name = "Bam";
		System.out.println(age);
		System.out.println(schoolYear);
		System.out.println(birthday);
		System.out.println(loveNumber);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(name);*/
		
		
		
				

	}

}
