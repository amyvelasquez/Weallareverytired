package com.class10;

public class ArrayTask {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it; A,B,C,D,E,F
		 * then print grade b
		 */
		
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[5]);
		
		System.out.println("__________Another way to create an Array_________");
		
		char [] grades1= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grades1[5]);// prints F
		
	    System.out.println("Number of elements in 2nd array is "+grades1.length);
		
	}

}
