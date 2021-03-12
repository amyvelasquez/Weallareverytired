package com.class4;

public class NestedIfExamples {

	public static void main(String[] args) {
		
		boolean morning=true;
		boolean classToday=true;
		
		if (morning) {
			System.out.println("i'm going to work");//true - will print
		}else {
			System.out.println("let's see if i have class");//everything from here fwd is disregarded since first if was true
			if (classToday) {
				System.out.println("i'll go to class");
			}else {
				System.out.println("i can relax");
			}
			
			morning=false;
			
			if (morning) {
				System.out.println("i'm going to work");//true - will print
			}else {
				System.out.println("let's see if i have class");}//everything from here fwd is disregarded since first if was true
				if (classToday) {
					System.out.println("i'll go to class");
				}else {
					System.out.println("i can relax");
				}
				
			
		}
	}
	
	
	}
