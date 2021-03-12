package com.class7;

public class WhileVSDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1;
		
		while(num<=5) {// while loop is used more often in programming versus do while
			System.out.println(num);
			num++;
		}
		
		System.out.println("________________________DO WHILE________________________");
		
		int num1=1;
		
		do {
			
			System.out.println(num1);
			num++;
			
		}while(num1<=5);
		
		
		/*
		 * while - check first then execute
		 * do - execute first then check ; even if condition is false. DO will execute code at least once
		 */
	}

}
