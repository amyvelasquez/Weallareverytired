package com.class11;

public class ArrayTask2 {

	public static void main(String[] args) {
		
		//1.
		
		String [][] names= {
				{"Mr.", "Mrs.","Ms.", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		System.out.println("_____________________");
		
		System.out.println();
		
		//2.
		
		String[][] names2= {
				{"Amy","John","Jack","Jeff"},
				{"A", "B","C","D","E"}
		};
		
		System.out.println(names2[0][0]+" has an "+names2[1][0]);
		System.out.println(names2[0][3]+" has a "+names2[1][1]);
		System.out.println(names2[0][2]+" has a "+names2[1][2]);
	}
}
