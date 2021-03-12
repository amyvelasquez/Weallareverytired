package com.class7;

public class ForLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<=3; i++) {// initialization, condition, check if its true.. then we enter block, then increment / decrement... THEN LOOP AGAIN
			
			System.out.println("hello");
		}
		
	    System.out.println();
		System.out.println("_________________________________Print numbers from 1-50______________________________________");
		
		for(int i=1; i<=50; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("_________________________________Print numbers from 10-1______________________________________");
		
		
		for (int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("_________________________________Print numbers from 10-1______________________________________");
		
		for (int a=0; a<=10; a+=2) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("____________________________________What's my output?_________________________________________");
		
		
		for(int i=5; i<=50; i+=10) {
			System.out.print(i+" ");
		}
		 //we were able to use variable i several times because my variable only exists inside the for block/body
		
	}
	

}
