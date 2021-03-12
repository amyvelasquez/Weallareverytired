package com.class5;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask User to enter age
		 * if 1 to 3--> baby
		 * if 3 to 5 --> bigger baby
		 * if 5 to 11 --> kid
		 * if 13 to 19 --> teenage
		 * if 20 and up --> adult
		 */
		
	Scanner input=new Scanner(System.in);
	int age;
	String name;
	
	System.out.println("Please enter your name.");
	name=input.nextLine();
	System.out.println("Please enter your age.");
	age=input.nextInt();
	
	if (age>=1 && age <=3) {
		System.out.println("You are a baby");
	}else if(age>=3 && age<=5) {
		System.out.println("You are a bigger baby");
	}else if(age>=5 && age<=11) {
		System.out.println("You are a kid");
	}else if(age>=13 && age<=19) {
		System.out.println("You are a teenager");
	}else if (age>=20) {
		System.out.println("You are an adult");
	}
	}

}
