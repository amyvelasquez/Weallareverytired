package com.class11;

public class GroupHWNumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Write program to print the first 10 numbers of the Fibonacci series. 

		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		
		int a, b, c;
		
		a=0;
		b=1;
		
		for (int i=1; i<=10; i++) {
			
			 System.out.print(a+" ");
			 c=a+b;
			 a=b;
			 b=c;
			 
		}
		
		System.out.println();
		System.out.println("________Another way to do same printout_______");
		
		int f1=0;
		int f2=1;
		
		for (int f=1;f<=10; f++) {
			
			System.out.print(f1+" ");
			
			f1=f1+f2;
			f2=f1-f2;
		}
		
		
		
	}

}
