package com.class5;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Calculate commission based on sales production
		 * 
		 * ask user to enter sales made
		 * if sale is less than 10 --> 0 commission
		 * if sale 10-100 --> 10% commission
		 * if sale 101-500 --> 20%
		 * if sale 501-1000 --> 30%
		 * if sale is more than 1000 --> 50% commission
		 */
		
		Scanner scan=new Scanner(System.in);
		
		double saleAmount, commission;
		
		System.out.println("Please enter your daily sale amount");
		saleAmount=scan.nextDouble();
		
		if(saleAmount<10) {
			commission=0;
		}else if (saleAmount >=10 && saleAmount <=100) {
			commission=saleAmount*0.1;	
		}else if (saleAmount >=101 && saleAmount <=500) {
			commission=saleAmount*0.2;
		}else if (saleAmount >=501 && saleAmount <=1000) {
			commission=saleAmount*0.3;
		}else if (saleAmount>1000) {
			commission=saleAmount*0.5;
		}else {
			commission=saleAmount*0;
		
		}
		
		// ^^^ We saved space and went ahead and stored the data in "commission" variable. 
		 System.out.println("Your commission is "+commission);
		 
		 

		 }
	 }
	



