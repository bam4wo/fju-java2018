package com.tom;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("You name:");
		String name = scanner.nextLine();
		System.out.println(name);
		
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
