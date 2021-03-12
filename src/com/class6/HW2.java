package com.class6;

import java.util.Scanner;

public class HW2 {

	public static void main(String[]args ) {
		
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Please enter your current grade.");
		
		String grade=userInput.nextLine();
		String desc;
		
		switch (grade.toUpperCase()) {
		
		case "A":
			desc="excellent";
			break;
		case "B":
			desc="good";
			break;
		case "C":
			desc="average";
			break;
		case "D":
			desc="bad";
			break;
		default:
			desc="not acceptable";
		}
		
		System.out.println("Your grade "+grade+" is "+desc);
	}
}
