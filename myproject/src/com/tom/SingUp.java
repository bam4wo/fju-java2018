package com.tom;

import java.util.Scanner;

public class SingUp {

	public static void main(String[] args) {
	      System.out.println("Are you 18? (y/N)");
	      Scanner scanner = new Scanner(System.in);
	      String line = scanner.nextLine();
	      //boolean adult = line.equals("y") || line.equals("Y");
	      boolean adult = line.equalsIgnoreCase("y");
	      Member member = new Member(adult);
	      if(member.adult){
	    	  member.starInput();
	      }else{
	    	  System.out.print("bye");
	    	  
	      }
	      
	    

	}

}
