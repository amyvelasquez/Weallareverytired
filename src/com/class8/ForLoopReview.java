package com.class8;

public class ForLoopReview {

	public static void main(String[] args) {

		/*
		 * Create a multiplication table
		 * 
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 * 1*4=4
		 * 
		 * etc
		 * 
		 * 1*10=10
		 */
		
		int num=1;
		int result;
		
		for (int a=1; a<=10; a++) {
			result=num*a;
			System.out.println(num+" * "+a+" = "+result);
		}
			
		
	}
}
