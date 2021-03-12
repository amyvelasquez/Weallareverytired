package com.class8;

import java.util.Scanner;

public class WhileLoopReview {
	
	public static void main(String[] args) {
		
		/*
		 * User should pay for soda
		 * Keep asking user to pay until he pays $3
		 * 
		 * If user gives more than $3 ---> ask to give less money
		 * If user gives less than $3 ---> ask to give more money
		 * 
		 */
		
		Scanner payment=new Scanner(System.in);
		
		double dollars=0;
		
		System.out.println("Please pay $3");
		
		do {
			dollars=payment.nextDouble();
			if (dollars>3) {
				System.out.println("Please give less money");
			}else if(dollars<3) {
	            System.out.println("Please give more money");		
			}
		}while (dollars!=3); 
		
		System.out.println("Here's your soda!");
		
		
		System.out.println();
		System.out.println("_____________Same as above_____________");
		System.out.println();
		
		System.out.println("Pay $3 for your soda");
		
		double money=payment.nextDouble();
		
		while (money!=3) {
			if (money<3) {
				System.out.println("Please insert more money");
		}else if(money>3) {
                System.out.println("Please insert less money");		
	} money=payment.nextDouble();
	
		}System.out.println("Thanks here is your soda.");

    }	
	
}
