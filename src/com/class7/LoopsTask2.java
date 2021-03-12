package com.class7;

import java.util.Scanner;

public class LoopsTask2 {

	public static void main(String[] args) {
		
		/*
		 * Capture your name 5x and say hello
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int q=5;
		
		while (q<=5) {
			
			if (q>0) {
		
		System.out.println("Please enter your name");
		
		String name=scan.nextLine();
		
		System.out.println("Hello "+name);
		
		}q--;
		}
		
		System.out.println("___________________________________________");
		
		//OR
		
		int r=5;
		
	while (r>=1) {
		
		System.out.println("Please enter your name");
		
		String name=scan.nextLine();
		
		System.out.println("Hello "+name);
	
		}r--;
		
	}
}
