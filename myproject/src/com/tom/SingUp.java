package com.tom;

import java.util.Scanner;

public class SingUp {

	public static void main(String[] args) {
	      System.out.println("Are you 18? (y/N)");
	      Scanner scanner = new Scanner(System.in);
	      String line = scanner.nextLine();
	      //boolean adult = line.equals("y") || line.equals("Y");
	      boolean adult = line.equalsIgnoreCase("y");
	      System.out.println(adult);
	      if(adult){
	    	  System.out.print("Your age?");
	    	  int age = scanner.nextInt();
	    	  scanner.nextLine();
	    	  System.out.print("Your name?");
	    	  String name = scanner.nextLine();
	    	  System.out.print("Your nickName?");
	    	  String nickName = scanner.nextLine();
	    			  
	    	  
	      }else{
	    	  System.out.print("bye");
	    	  
	      }
	      
	    

	}

}
