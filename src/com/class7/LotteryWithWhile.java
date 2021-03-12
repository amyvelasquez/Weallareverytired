package com.class7;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		
		int num;
		int winningNumber=17;
		
		System.out.println("Enter any number from-100 to hit the jackpot!");
	    num=input.nextInt(); 
	    
		while (num!=winningNumber) {
			System.out.println("Enter any number from 1-100 to hit the jackpot!");
		    num=input.nextInt(); 
		    if (num<=1 || num>=100) {
		    System.out.println("Error - Enter a number from 1-100");
		    }
		}
		
		System.out.println("CONGRATULATIONS! You hit the jackpot!!!!!!");
	}
}
