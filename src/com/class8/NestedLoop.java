package com.class8;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<3; i++) {
			System.out.println("I'm the outer loop");
		}
			for (int j=1; j<=3; j++) {
				System.out.println("I'm the inner loop");
		}
			for (int a=1; a<=10; a++) {
				System.out.print(a+" ");
				
			} System.out.println();
			for (int b=2; b<=20; b+=2) {
				 System.out.print(b+" ");
			} System.out.println();
			for (int c=3; c<=30; c+=3) {
				System.out.print(c+" ");
			} System.out.println();
			for (int d=4; d<=40; d+=4) {;
				System.out.print(d+" ");
			} System.out.println();
			for (int e=5; e<=50; e+=5) {
				System.out.print(e+" ");
			}
	}
}
