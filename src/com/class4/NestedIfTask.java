package com.class4;

public class NestedIfTask {

	public static void main(String[] args) {
		
		boolean graduated=true;
		double gpa=3.89;
		
		
		if(graduated) {
			System.out.println("Congrats!!!!");
			if (gpa>3.5) {
				System.out.println("You are eligible for a scholarship");
			}else if(gpa<3.5) {
				System.out.println("you should have studied harder");
			}
    	}else {
				System.out.println("You should go back to school");
			}
			
		System.out.println("_____________next task______________");
		
		double rate=2.65;
		double price=535000;
		
		if (rate>4.5) {
			System.out.println("I cant buy a house rn");
		}else {
			System.out.println("I'l consider buying a house");
			if(price>200000) {
				System.out.println("I'll get a loan");
			} else {
				System.out.println("I'll pay cash!");
					
				}
			}
		if (rate<4.5) {
			System.out.println("I'll consider buying a house");
			if (price>200000) {
				System.out.println("I'll get a loan");//// SAME OUTPUT AS ABOVE CONDITIONS - JUST FLIPPED OPERATOR
			}else {
				System.out.println("I'll pay cash");
			}
		}else {
			System.out.println("I'm not buying");
		}
		
		}	
	
}
