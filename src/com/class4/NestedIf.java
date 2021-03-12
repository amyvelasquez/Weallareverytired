package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean morning=true;
		
		boolean classToday=true;
		
		//is it morning? - If yes, "good morning. Let me check if I have class today"
		//     Is there class today? - If yes, "good morning classmates"
		//                           - otherwise, "hello family"
		
		if (morning) {
			System.out.println("good morning. Let me check if I have class today");// true - it will print
			if (classToday) {
				System.out.println("good morning classmates");//true - it will print
			}else {
				System.out.println("hello family");//previous if condition is true so this WILL NOT print
			}
		}
		
		System.out.println("_______end of code_______");
		
		morning=false;
		if (morning) {
			System.out.println("good morning. Let me check if I have class today");// false - it will NOT print
			if (classToday) {
				System.out.println("good morning classmates");//NOT PRINT - main if condition was false so we wont even move on to this if condition 
			}else {
				System.out.println("hello family");//NOT PRINT - MAIN IF CONDITION IS FALSE SO WE WILL NOT MOVE TO THIS BRACKET OR LINE
			}
		}
		//NONE OF THE ABOVE WILL PRINT BECAUSE THE MAIN IF CONDITION WAS FALSE.
		System.out.println("_______end of code_______");
		
		
		morning=true;
		classToday=false;
		if(morning) {
			System.out.println("It's morning. Do I have class?");//this is true. it will print
			if(classToday) {
				System.out.println("i have class");//this will NOT print because it's false
			}else {
				System.out.println("no class today");//this will print because the previous if condition was false
			}
			
			System.out.println("_____________2nd example____________");
			
			boolean anyAllergy=true;
			boolean pollenAllergy=false;
			
			if(anyAllergy) {
				System.out.println("Yes? ok let's check which allergies you have.");//true - print
				if(pollenAllergy) {
					System.out.println("stay inside in spring");//false-NOT print
				}else {
					System.out.println("no pollen allergy? ok you may go outside");//true-prev condition is false -WILL PRINT
				}
				
			}
			
			
		}
		
		System.out.println("___________3rd example___________");
		/*
		 * If its friday, we'll go the movies-otherwise stay home
		 *    if its friday the 13th, we'll go watch a scary movie
		 *      if not then we'll watch something else
		 */  
		
		boolean itsFriday=true;
		int day =13;
		
		if(itsFriday) {
			System.out.println("we're going to the movies");//true -will print
			if(day==13) {
				System.out.println("let's watch a scary movie");//true - will print
			}else {
				System.out.println("lets watch any other movie");//will not print
			}
		}else {
			System.out.println("ill stay home");//will not print since first if condition is true
		}
		
		System.out.println();
		
		day=18;
		
		if(itsFriday) {
			System.out.println("we're going to the movies");//true -will print
			if(day==13) {
				System.out.println("let's watch a scary movie");//false - WILL NOT print
			}else {
				System.out.println("lets watch any other movie");//true - will print
			}
		}else {
			System.out.println("ill stay home");//will not print since first if condition is true
		}
		
		System.out.println("________next example______");
		
		boolean completed=true;
		int score=88;
		
		if(completed) {
		
			if (score>90) {
				System.out.println("great job");
			}else if (score>80) {
				System.out.println("good job");
			}else if(score>70) {
				System.out.println("great try.. lets do better");
		}else {
				System.out.println("need more practice");
			}
	}else {

		System.out.println("Please complete assignments on time");
	}
	
		
}
	
	}
	


