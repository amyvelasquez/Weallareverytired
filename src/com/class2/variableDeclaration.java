package com.class2;

public class variableDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1ST way to create variable (one step)
		
	 short b=245; //created variable and assigned value
	              // AKA declared variable and initialized at once
	 
		//2ND way to created variable (3 steps)
	 
	 int sum; // declaration (occurs only once)
     sum=20; // initialization
	 sum=30; // reassigned value
	 
	 int x,y,z; // declaration of multiple variables of same value type at once
	 x=817298;
	 y=2572;//initialization of x,y,z
	 z=4930;
	 
	 
	x=32089;//reassigned value of int x	
	
	byte blue=123;
	byte green=blue;//used variable blue to initialize and declare variable green. they both equal 123
	
	System.out.println(green);
	
			 
	 
	}
	
	
}