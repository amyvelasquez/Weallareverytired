package com.class4;

import java.util.Scanner;

public class HomeworkPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is the amount of the loan you need?");
		
		int loanAmount=scan.nextInt();
		
		if (loanAmount<=200000) {
			System.out.println("You may have the loan.");
		}else {
			System.out.println("Sorry, we can't lend you that amount.");
		}
		
		System.out.println("______________________________________________________");
		
		//2.
		
		System.out.println("How old are you?");
		
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("Here's your DL!");
		}else {
			System.out.println("You're too young for DL. Here's your learner's permit");
		}
		
		System.out.println("______________________________________________________");
		
		
		//3.
		Scanner questions=new Scanner(System.in);
		
		System.out.println("Please enter your city and the temperature there.");
		
		String city=questions.nextLine();
		
		int fahrenheitTemp=scan.nextInt();
		double celsiusTemp=(fahrenheitTemp-32)/1.8;
		
		System.out.println("The temperature in "+city+" is "+celsiusTemp);
		
		
	}

}
