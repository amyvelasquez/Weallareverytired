package com.class6;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Based on the time, identify what time of day it is... ex:(morning, afternoon, evening)
		 * 
		 * if 1 to 11 --> morning
		 * if 12 to 13 -- noon
		 * if 14 to 17 --> afternoon
		 * if 18 to 21 --> evening
		 * if 22 to 24 --> night
		 */
		
		Scanner hora=new Scanner(System.in);
		
		System.out.println("Please enter the time in 24 hour format");
		
		int time=hora.nextInt();		
		String timeOfDay=null;
	
		
		
		if (time>=1 && time<=11) {
			timeOfDay="morning";
		}else if (time>=12 && time<=13) {
			timeOfDay="noon";
		}else if (time>=14 && time<=17) {
			timeOfDay="afternoon";
		}else if (time>=18 && time<=21) {
			timeOfDay="evening";
		}else if (time>=22 && time <=24) {
			timeOfDay="night";
		}
		
		System.out.println("Based on the entered time, the time of day is "+timeOfDay);
		
		/*
		 * Compiler can initialize variable to their default:
		 * Default values are as follows -
		 * int - 0
		 * double - 0.0
		 * boolean - false
		 * String and all Non Primitives - null
		 */

		
		System.out.println("Please enter a number");
		
		int num=hora.nextInt();

		if (num%2==0) {
			System.out.println("Value is even");{
			}if (num>1000) {
				System.out.println("Even value is large");
			}else {
				System.out.println("Even value is just right");
			}
		}else {
			System.out.println("Value is odd");
			if (num>1000) {
				System.out.println("Odd number is large");
			}else {
				System.out.println("Odd number is just right");
			}
		}
	}

}
