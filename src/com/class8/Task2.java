package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

//1.
		//Range from 50-100
		
		Scanner input=new Scanner(System.in);
		
		int num, even, odd;
		
		even=0;
		odd=0;
		
		System.out.println("Please enter a range 50-100");
		
		String range=input.nextLine();
		
		if (range.equals("50-100")) {
			
			for (int a=50; a<=100; a++) {
				 
				if (a%2==0) {
					even+=a;
				}else {
					odd+=a;
				}
				
			}
			
			 System.out.println("The sum of all odd numbers is"+odd);
			 System.out.println("The sum of all odd numbers is"+even);
			 System.out.println("The sum of all numbers is"+(odd+even));
			 
		}else {
			System.out.println("Please enter range 50-100");
		}
		
		
		
	}

}
