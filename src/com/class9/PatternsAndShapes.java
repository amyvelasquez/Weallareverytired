package com.class9;

public class PatternsAndShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for (int r=1; r<=4; r++) {
	
			for (int c=1; c<=5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		} 
		
		System.out.println("___________________________");
		System.out.println();
		
		for (int r=1; r<=6; r++) {
			
			for (int c=1; c<=8; c++) {
				System.out.print("* ");
			}	
			System.out.println();	
		}
		
		System.out.println("_____________________________");
		System.out.println();
		
		
		for(int a=1; a<=4; a++) {
			for (int b=1; b<=5; b++) {
				System.out.print(b+" ");
			}
				System.out.println();
		}
		System.out.println("____________________");
		System.out.println();
		
		
		for ( int a=5; a>=1; a--) {
			for (int b=6; b>=1; b--) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println("_______________________");
		System.out.println();
		
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("_______________________");
		System.out.println();
		
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
