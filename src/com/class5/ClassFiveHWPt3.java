package com.class5;

import java.util.Scanner;

public class ClassFiveHWPt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//3.
		
		 Scanner values=new Scanner(System.in);
			
			double val4, val5, val6, largest;
			
			System.out.println("Please enter 3 different numbers.");
			
			val4=values.nextDouble();
			val5=values.nextDouble();
			val6=values.nextDouble();
			
			if (val4==val5 && val5==val6) {
				System.out.println("Numbers are equal");
				
			}else {
				
		  	  if (val4>val5) {
			    	if(val4>val6) {
					largest=val4;
		    		}else {
		    			largest=val6;
		    		}
		    	}else {
	    			if(val5>val6) {
	    				largest=val5;
	    			}else {
			    		largest=val6;
	    			}
		    	}
		  	System.out.println("The largest number is "+largest);
		  	  
			}
		
		Scanner user=new Scanner(System.in);

		System.out.println("Do you need a loan?");

		boolean needsLoan=user.nextBoolean();

		int score;
		
		
		if (!needsLoan) {
			System.out.println("Unknown");
		}else {
			System.out.println("What is your credit score?");
			score=user.nextInt();
			if (score<600){
				System.out.println("Not eligible");
			}else if (score >=600 && score <=700) {
				System.out.println("Maybe eligible");
			}else if (score>=701 && score <=800) {
				System.out.println("Eligible");
			}else {
				System.out.println("Definitely eligible");
			}
		}
		
		
		Scanner prompt=new Scanner (System.in);

		System.out.println("Please enter two strings");

		String one=prompt.nextLine();
		String two=prompt.nextLine();

		System.out.println("Please enter two numbers");

		int num1=prompt.nextInt();
		int num2=prompt.nextInt();

		if (num1==num2 && one.equals(two)){
			System.out.println("AND");
		}else if (num1==num2 || one==two) {
			System.out.println("OR");
		}else {
			System.out.println("NONE");
		}
	}	
		
}	
		
		
		
		
		


	
