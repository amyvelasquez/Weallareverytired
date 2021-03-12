package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String [][] usa= {
				
				{"Alexandria","Oakton","Arlington","VA Beach","Fairfax"},
				
				{"Philly","Strassburg","Pittsburgh"},
				
				{"Boston","Quincy","Springfield","Burlington"},
				
				{"LA","Long Beach","San Francisco","Sacranento","Santa Barbara"},
				
				{"Miami","Orlando","Tampa","Tallahassee"}
		};
		
		//so how would we create this same 2D array using the longer version… what would we put for the size of arrays? since they’re not all the same..
		
		System.out.println(usa.length);//gives me amount of arrays
		System.out.println(usa[0].length);//gives me how many elements inside specific array
		System.out.println(usa[1].length);
		
		for (int r=0; r<usa.length; r++) {//Outer loops control Arrays/Rows
			for (int c=0; c<usa[r].length; c++) {//Inner loops control Elements in arrays/columns
				System.out.println(usa[r][c]);
			}
		}
		
		System.out.println();
		System.out.println("_______Using Nested For Each Loop______-");
		
		for (String[] cities:usa) {
			for (String city:cities) {
				System.out.print(city+", ");
			}
		}
		
		System.out.println();
	}
}
