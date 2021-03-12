package com.class4;

import java.util.Scanner;

public class anotherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Capture 2 #s from user and then compare.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("pleas eneter first number");
		
		int num1=input.nextInt();
		
		System.out.println("please enter second number");
		
		//int num2=22;//hard coded num2 to equal 22
		
		int num2=input.nextInt();//allowing to dynamically code through scanner
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if(num1<num2) {
			System.out.println(num2+" is larger than "+num1);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
	}

}
