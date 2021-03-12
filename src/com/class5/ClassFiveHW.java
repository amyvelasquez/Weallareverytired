package com.class5;

import java.util.Scanner;

public class ClassFiveHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.
		
		Scanner answers=new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		
		String month=answers.nextLine();
		
		String season;
		
		if (month.equals("January") || month.equals("February") || month.equals("March") || month.equals("December")){
			season="Winter";
		}else if (month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September")|| month.equals("October") || month.equals("November")){
			season="Fall";
		}else {
			season="Invalid";
		}
		System.out.println("You were born in "+season);
		

	}

}
