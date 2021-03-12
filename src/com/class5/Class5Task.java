package com.class5;

import java.util.Scanner;

public class Class5Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TASK #1
		String printout;
		
		Scanner answer=new Scanner (System.in);
		
		System.out.println("Enter your height in inches");
		
		int height=answer.nextInt();
		
		if (height < 60) {
			System.out.println("short");
		}else if (height >=60 && height <=72) {
			System.out.println("medium");;
		}else if (height >=72) {
			System.out.println("tall");;
		}
		
		//TASK #2
		System.out.println("What day is it?");
	int day=answer.nextInt();
	
	if (day >=1 && day<=5) {
		System.out.println("It's a weekday");
	}else if (day >=6 && day <=7) {
		System.out.println("It's a weekend");
	}else {
		System.out.println("Invalid day");
	}
		
	
		
	}

}
