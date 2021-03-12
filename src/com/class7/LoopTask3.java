package com.class7;

public class LoopTask3 {

	public static void main(String[] args) {
	
		//1.
		for (int even=20; even>=1; even-=2) {
			System.out.print(even+" ");
		}
		System.out.println();
		System.out.println("_________2nd way to print even numbers_________");
		
		for (int even1=1; even1<=20; even1++) {
			if (even1%2==0) {
				System.out.print(even1+" ");
			}
		}

		System.out.println();
		System.out.println("_______Odd Numbers from 20-50_______");
		
		for (int odd=50; odd>=20; odd--) {
			if (odd%2!=0) {
			System.out.print(odd+" ");
			}
		}
		
		System.out.println();
		System.out.println("____Second way to print odd numbers____");
		
		for (int odd1=20; odd1<=50; odd1++) {
			if (odd1%2!=0) {
				System.out.print(odd1+" ");
			}
			
			System.out.println("_________What's the output?________");
			
			int sum=0;
			
			for (int i=1; i<=5; i++) {
				sum=sum+i;
				System.out.print(sum+" ");
			}
		}
		
		
	}	
}
