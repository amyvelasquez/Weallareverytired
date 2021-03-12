package com.class8;

public class BreakKeyword {

public static void main(String[] args) {
	
	boolean rain=true;
	int temp=60;
	
	while (rain) {
		System.out.println("I'll stay home");
		
		if (temp>75) {
			System.out.println("I'll take a walk under warm rain");
			break;
		}
		
		temp+=2;
	}
	
	   System.out.println("_______________________________");
	   System.out.println();
	   
	   for(int i=1; i<=10; i++) {
		   System.out.println("Hello");
		   
		   if (i==5) {
			   break;
		   }
		   
		   System.out.println("I'm inside the loop");
	   }
	
	   System.out.println("_______________________________________");
	   System.out.println();
	   
	   /*
	    * Print all numbers form 1-10, skip 5 & 6
	    */
	   
	   for (int i=1; i<=10; i++) {
		   
		   if (i==5 || i==6) {
			  
			   continue;
		   }
		   
		   System.out.print(i+" ");
	   }
	   
	   System.out.println();
	   System.out.println("________________________________________");
	   System.out.println();
	   
	   /*
	    * Print numbers 1-40, expect those divisible by 4
	    */
	   
	   for (int i=1; i<=40; i++) {
		   
		   if (i%4==0) {
			   continue;
		   }
		   System.out.print(i+" ");
	   }
}	
}
