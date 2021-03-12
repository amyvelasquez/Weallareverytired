package com.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names=new String[4];
		
		names[0]="Adonys";
		names[1]="Reniery";
		names[2]="Velasquez";
		names[3]="Pinto";
		
		System.out.println(names[0]);
		
		String[] names2= {"Adonys", "Reniery", "Velasquez", "Pinto"};
		
		System.out.println(names2[3]);
		
		String[] array= {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(array[1]+" "+array[4]+" "+array[0]+" "+array[3]+" "+array[2]);
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
