package com.class7;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
		/*
		 * Playing Lottery
		 *Winning Number = 17 
		 *Continue asking user to enter number from 1-100 
		 *Until winning number is entered
		 */
		
		Scanner input=new Scanner(System.in);
		
		int num;
		int winningNumber=17;
		
		do {// we used DO because we needed to perform an action first. needed to have user enter number
		System.out.println("Enter any number from-100 to hit the jackpot!");
	    num=input.nextInt();
		
		}while (num!=winningNumber);
		
			System.out.println("CONGRATULATIONS! You hit the jackpot!!!!!!");
		
			 int a=10; 

			  do {
			    System.out.println(a);
			    a++;
			  } while (a>20);
			
	}
}
