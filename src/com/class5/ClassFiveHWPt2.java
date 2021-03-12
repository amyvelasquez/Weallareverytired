package com.class5;

import java.util.Scanner;

public class ClassFiveHWPt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2.
		
		Scanner values=new Scanner(System.in);
		
		System.out.println("Please enter 3 different numbers.");
		
		double val1, val2, val3, largest;
		
		System.out.println();
		
		val1=values.nextDouble();
		val2=values.nextDouble();
		val3=values.nextDouble();

		
		
		if(val1>val2 && val1>val3) {
			largest=val1;
		}else if (val2>val1 && val2>val3) {
			largest=val2;
		}else if (val3>val1 && val3>val2) {
			largest=val3;
		}else {
			largest=0;
		}
		System.out.println("The largest number is "+largest);
		
	}

}
