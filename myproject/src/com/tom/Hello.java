package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hank";
		int english = 70;
	    int math = 90;
	    System.out.println(name+"\t"+english+"\t"+math+"\t"+(english+math)/2);
		
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
