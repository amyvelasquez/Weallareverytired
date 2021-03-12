package com.class4;

import java.util.Scanner;

//shortcut for mac to import cmd+shift+o

public class DemoScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//capture different values 
		
		System.out.println("type here.");
		
		int i=10;
		String str="hello";
		
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();//scan.nextLine(); --> captures any (#'s, words, etc) input from console once you hit enter
		
		System.out.println("Text we entered is -"+text);
		
		System.out.println("Please enter text.");
		
		String name=scan.next();//captures one word til space
		System.out.println("Nice to meet you "+name);
		
	    int age=scan.nextInt();//this captures numbers
	    
	
	System.out.println("This will be the third scan.");
	System.out.println(age);
	

	
	}

}
