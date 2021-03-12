package com.class6;

import java.util.Scanner;

public class ShoppingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner shopping=new Scanner(System.in);
		
		System.out.println("Is there a sale today?");
		
		boolean sale=shopping.nextBoolean();
		double price, discount, finalPrice;
		String item="tablet";
		discount=0;
		finalPrice=0;
			
		if(sale) {
			
			System.out.println("How much is this "+item+"?");
			price=shopping.nextDouble();
			
			if (price<10) {
				discount=price*.05;
			}else if(price>=10 && price<100) {
				discount=price*.1;
			}else if (price>=100 && price<500) {
				discount=price*.2;
			}else if (price>=500) {
				discount=price*.3;
			}
			
			finalPrice=price-discount;
			System.out.println("I bought a "+item+" for "+finalPrice+" dollars using a "+discount+" dollar discount.");
			
		}else {
			System.out.println("I'm staying home.");
		}

		
	
		
	}

}
