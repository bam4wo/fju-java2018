package com.tom;

public class Student {
	String name;
	int english;
	int math;
	
	public Student(String name, int english, int math){
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public void  print(){
		System.out.print(name+"\t"+english+"\t"+math+"\t");
		System.out.print(getAverage()+"\t"+highter()+"\t");
		if(getAverage() < 60){
			System.out.print("FAILED");
		}else{
			System.out.print("PASS");
		}
		System.out.print("\t" + getGreding());
	}
	
	public char getGreding(){
		char greding = 'F';
		int average = getAverage();
		switch(average/10) {
		case 10:
		case 9:
			greding = 'A';
			break;
		case 8:	
			greding = 'B';
			break;
		case 7:
			greding = 'C';
			break;
		case 6:
			greding = 'D';
			break;
		default:
			greding = 'F';
		}
		return greding;
	}
	
	public int highter(){
		if(english > math){
			return english;
		}else{
			return math;
		}
	}
	public int getAverage(){
		return (english+math)/2 ;
	}
    
}
