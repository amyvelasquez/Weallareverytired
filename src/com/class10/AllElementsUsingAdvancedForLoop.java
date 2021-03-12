package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AKA for each, enhanced for loop, advanced for loop USED ONLY WITH ARRAYS OR COLLECTIONS!!!
        // This for loop type only prints from beginning to end, cannot print reverse
		
		
		int []numbers= {10, 14, 78, 5, 90};
		
		for(int num:numbers) {// for(dataType variableName:nameOfArray){
			if (num%2==0) {
			System.out.print(num+" ");
			}
		}
		System.out.println();
		System.out.println("__________________");
		System.out.println();
		
		String[] names2= {"Adonys", "Reniery", "Velasquez", "Pinto"};
		
		for (int a=0; a<4; a++) {
			System.out.print(names2[a]+" ");
		
		}
		System.out.println();
		System.out.println();
		System.out.println("_______Same as Above but Advance For loop________");
		System.out.println();
		
		for (String n:names2) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("___________________________________________________");
		System.out.println();
		
		
		char [] grades1= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for (char g:grades1) {
			System.out.println(g+" ");
		}
		System.out.println();
		System.out.println("_____________________________________________________");
		System.out.println();
		
		
		boolean[] boo= {true, false, false, false, true};
		
		for (boolean a:boo) {
			System.out.print(a+" ");
		}
		
		
	}

}
