package com.class4;

import java.util.Scanner;

public class HomeworkPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consult=new Scanner(System.in);
		
		//1.
		
		System.out.println("Do you have a credit card?");
		
		String ccOwner=consult.nextLine();
		
		
		if(ccOwner.equalsIgnoreCase("Yes")){
			System.out.println("What is the balance on your credit card?");
			int ccBalance=consult.nextInt();
			if (ccBalance>1000) {
				System.out.println("You should pay that off immediately!");
			}else {
				System.out.println("You can spend a little more!");
			}
		}else {
			System.out.println("Would you like to apply for a credit card?");
		}
		
		System.out.println("______________________________________________________");
		
		//2.
		Scanner number2=new Scanner(System.in);
		
		System.out.println("Please enter number of years worked and your annual salary.");
		
		int yearsWorked=number2.nextInt();
		int annualSalary=number2.nextInt();		
		if (yearsWorked>=5) {
			System.out.println("User is eligible for a bonus!");
			if (annualSalary>50000) {
				System.out.println("User is eligible for a $5000 bonus!");
			}else {
				System.out.println("User is eligible for a $3000 bonus!");
			}
		}else {
			System.out.println("User is not eligible for a bonus.");
		}
	}

}
