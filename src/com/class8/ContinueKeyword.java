package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=1;i<=10; i++) {
			System.out.println("hello");
			
			if (i==3) {
				continue;	
			}
			
			System.out.println("I'm in side the loop");
		}
		
	}
}
