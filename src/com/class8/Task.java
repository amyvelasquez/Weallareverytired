package com.class8;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		//1.
		for(int a=1; a<=50; a++) {
			
			if(a%3==0) {
				continue;
			}
			
			System.out.print(a+" ");
		}
		System.out.println();
		//2.
		Scanner answer=new Scanner(System.in);
		
		System.out.println("Please apply for a credit card");
	
		boolean cc=answer.nextBoolean();
		
		do {
			System.out.println("Please apply for a credit card");
			cc=answer.nextBoolean();
		}while (!cc);
		
		System.out.println("Great! Let's submit your application.");
	}

}
