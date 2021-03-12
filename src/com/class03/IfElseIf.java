package com.class03;

public class IfElseIf {

	public static void main(String[] args) {

		double num1 = 15.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		} else if (num1 == num2) {
			System.out.println("Double values are equal");
		}

		else {
			System.out.println("Double value " + num2 + " is larger than " + num1);
		}

		int day = 6;

		if (day == 1) {
			System.out.println("Today is Monday.");
		} else if (day == 2) {
			System.out.println("Today is Tuesday.");
		} else if (day == 3) {
			System.out.println("Today is Wednesday.");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday.");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday.");}

	}

}
