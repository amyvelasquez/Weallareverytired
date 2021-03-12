package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Logical Operators are used when When i have to test 2 or more conditions
		
		/*
		 * Identify is # is small, medium, large, extra large
		 * if 1-10, small
		 * if 11-100, medium
		 * if 101-1000, large
		 * if 100-100000, x large
		 */
		
		int num=45;
		
		if (num<1) {
			System.out.println(num+" is 0 or negative");
		}else if (num>=1 && num<=10) {
			System.out.println(num+" is small");
		}else if (num>= 11 && num <=100) {
			System.out.println(num+" is medium");
		}else if(num>=101 && num<=1000) {
			System.out.println(num+" is large");
		}else if (num>=1001 && num<=100000) {
			System.out.println(num+" is xlarge");
		}else {
			System.out.println(num+" is huge");
		} 
		
		//^^^BOTH sides of '&&' conditions must be true in order for execution to occur^^^
		
		
		
		
	}

}
