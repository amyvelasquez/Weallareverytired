package com.class9;

public class Recap {

	public static void main(String[] args) {
		
		for (int i=1; i<4; i++) {
			for (int j=1; j<5; j++) {
				System.out.println("Good evening");
			}
		}
		System.out.println();
		System.out.println("______________");
		System.out.println();
		
		for ( int i=5; i<7; i++) {
			System.out.println("Outer");
			for (int j=10; j<=12; j++) {
				System.out.println("Inner");
		} 
		}
		
		System.out.println();
		System.out.println("______________Print from 10-99______________");
		System.out.println();
		
		for (int a=10; a<=99; a++) {
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println("________Same as above but nested_______");
		
		for (int a=1; a<=9; a++) {
			for (int b=0; b<=9; b++) {
				System.out.println(a+""+b);
			}
		}
		
		System.out.println();
		System.out.println("Printing from 0000 to 9999 like odometer");
		System.out.println();
		
		for (int a=0; a<=9; a++) {
		
			for (int b=0; b<=9; b++) {
				
				for (int c=0; c<=9; c++) {
					
					for (int d=0; d<=9; d++) {
						System.out.println(a+""+b+""+""+c+""+d);
					}
				}
			}
		}
		

	}
}
