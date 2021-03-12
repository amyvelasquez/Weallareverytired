package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*variable day
		 * 
		 * if day = Tuesday or Wednesday --> Manual Class
		 * if day = Monday or Friday --> No class
		 * if day is Saturday or Sunday ==> Java Class
		 * if day is Thursday --> Review Class
		 */
		
		String day="Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("No class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Manual Class");
		}else if (day.equals("Thursday")) {
			System.out.println("Review Class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Java Class");
		}else {
			System.out.println("Invalid day");
		}
		
		// Only one of the || conditions need to be true for the execution to occur
	}

}
