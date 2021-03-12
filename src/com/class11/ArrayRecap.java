package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		
	
		
		Scanner input=new Scanner(System.in);
	
		String [] array;
		
		System.out.println("Please enter the size of your array");
		int size=input.nextInt();
		
		array=new String [size];
		
        for (int i=0; i<size; i++) {        
       
        	System.out.println("Please enter elements");
        	array[i]=input.next();	
        }
        
        System.out.println("_________Let's see what we stored__________");
        System.out.println();
        
        for (String str:array) {
        	System.out.println(str);
        }

        
        int[] arrays=new int [5];

        Scanner scan=new Scanner(System.in);

        arrays [0]=scan.nextInt();
        arrays [1]=scan.nextInt();
        arrays [2]=scan.nextInt();
        arrays [3]=scan.nextInt();
        arrays [4]=scan.nextInt();

        for (int a=4; a>=array.length; a--){
           System.out.print(array[a]);
	}


	}
}
