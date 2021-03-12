package com.class11;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		
		/*
		 * Create an array on double 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter size of array");
		
		int size=scan.nextInt();
		
		double[] a=new double[size];
		
		double sum=0;
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter your values");
			a[i]=scan.nextDouble();
			sum+=a[i];
			
		}System.out.println("Sum of array's elements is equal to "+sum);
		
		System.out.println("_________Diff/easier way of doing same thing________");
		
		for (double num:a) {
			sum+=num;
		}System.out.println(sum);
		
	}
	
}
