package com.class5;

public class ifWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//not using braces will cause incorrect outcomes since condition blocks are not specified	
		//without braces, the if condition can only take one statement
	
		String day="Friday";
		if(day.equals("satday"))
			System.out.println("movie day");
		    System.out.println("class tomorrow");
		
		System.out.println("_____end of program_____");
		
		int num=10;
		
		if(num>=10)
			System.out.println("number is greater than 10");
		else 
			System.out.println("number is less than 10");
		    System.out.println("this will print also because we havent specified if its part of conditions");
		   
		    //if no statement java identifies only 1 statement per if or else block
		    
	}

}
