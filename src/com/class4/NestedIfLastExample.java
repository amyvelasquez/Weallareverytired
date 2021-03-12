package com.class4;

public class NestedIfLastExample {

	public static void main(String[] args) {
		
		/*
		 * Req. to donate -
		 *   >18 y/o
		 *   weight >110lbs
		 */
		
		int age=23;
		int weight=122;
		
		if (age>=18) {
			System.out.println(" You may be eligible to donate");
			if(weight>=110) {
				System.out.println("You may donate!");
			}else {
				System.out.println("You may not donate.");
			}
		}else {
			System.out.println("You're not eligible");
		}
			
	}
}
