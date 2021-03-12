package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean rain=false;
		
		if (!rain) {
			System.out.println("I'll go to the park."); // will print since it's not (!) raining
		}
		
		boolean boo=!true;
		System.out.println(boo);//will print as false since our (!) operator reversed our value
		
		boolean boo1=!false;
		System.out.println("boo1");//will print as true for same reasons as above ^^
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("I'll make it to the meeting on time.");
		}
				
		String day="Sunday";
		
		if (!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		boolean homework=true;
		
		if (!homework) {
			System.out.println("I'm happy");
		}
	}

}
