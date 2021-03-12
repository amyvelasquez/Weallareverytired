package com.class03;

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b=7;
		
		if (a>b){
			System.out.println("a is greater than b");}
		else {
			System.out.println("b is greater than a");
		}
		
		System.out.println("____________________________________________");
		
		int temp=30;
		
		if(temp>30) {
			System.out.println("I will go for a walk.");//never printed because temp is not greater than 30
		}
			int temp1=79;
			
			if (temp1>30) {
				System.out.println("I'm going for a walk.");}//this prints because 35 is greater than 30
			else {
				System.out.println("I'm staying home");// this wont print
			}
			
			
	System.out.println("this will print with no problem because it is not inside any if else conditions");
	

	
	}

}
