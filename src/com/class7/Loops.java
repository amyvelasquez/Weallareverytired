package com.class7;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		System.out.println("__________________");
		
		int time =11;
		
		
		if (time<12) {
			System.out.println("hello");//code executes once 
		}
		
		System.out.println("__________________");
		
		// use while loop
		
		while (time<12) {
			System.out.println("hello");// code runs infinitely
			time++;//time is now = 12 so code stops executing
		}
		
		System.out.print("_______Print numbers from 1-10_______");
		
		int num=1;
		
		while (num<11) {
			System.out.println(num+" ");
			num++;// adds 1 to num each time loop executes. num becomes 2, then 3, then 4, 5, 6, 7, 8, 9 , 10.
			      // stops at 10 because after 10, condition becomes false
		}
		
		System.out.println
		("________print from 20-40_______");
		
		int num1=20;
		
		while (num1<=40) {
			System.out.println(num1+" ");
			num1++;
		}
		
		int a=10;
		
		while (a>=1) {
			System.out.println(a+" ");
			a--;//makes value=9, then 8, then 7,6,5,4,3,2,1 and stops once condition becomes false
		}
		
		int nums=1;
		
		while (nums<=100) {
			System.out.print(nums);
			nums++;
		}
		
		
	}

}
