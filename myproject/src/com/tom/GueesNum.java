package com.tom;

import java.util.Random;

public class GueesNum {
	int secert;
	public GueesNum(){
		Random random = new Random();
		int secert = random.nextInt((10)+1);
		System.out.println(secert);
	}
	
	public int guess(){
		return  secert;
	}
	
}
