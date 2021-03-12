package com.class6;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int day =40;
		String weekday;
		
		if (day==1) {
			weekday="Monday";
		}else if (day==2) {
			weekday="Tuesday";
		}else if (day==3) {
			weekday="Wednesday";
		}else if (day==4) {
			weekday="Thursday";
		}else if (day==5) {
			weekday="Friday";
		}else if(day==6){
			weekday="Saturday";
		}else if(day==7) {
			weekday="Sunday";
		}else {
			weekday="Invalid";
		}
		
		if (!weekday.equals("Invalid")) {
			System.out.println("Today is "+weekday);
		}
		
		//if works with conditions; evaluates if case is true/false
		
		
		//switch is value based
	    //CANNOT have duplicate cases
		//values must match variable type
		//MUST have a break after every case
		//no relational or logical operators allowed
		//ONLY for byte, short, int, char, String
		
		System.out.println("_________________SWITCH___________________");
		String weekday1;
		
		switch(day) {
		
		case 1:
			weekday1="Monday";
			break;
		case 2: 
			weekday1="Tuesday";
			break;
		case 3:
			weekday1="Wednesday";
			break;
		case 4:
			weekday1="Thursday";
			break;
		case 5:
			weekday1="Friday";
			break;
		case 6:
			weekday1="Saturday";
			break;
		case 7:
			weekday1="Sunday";
			break;
		default:
			weekday1="Invalid";
			break;
		}
		
		if (!weekday.equals("Invalid")) {
			System.out.println("Today is "+weekday1);
		}
		
		
	}
}
