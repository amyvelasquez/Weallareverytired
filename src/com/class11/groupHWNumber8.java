package com.class11;

public class groupHWNumber8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 76, 976,56, 239, 07, 1669 };
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value is "+max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Miminum value is "+min);
	}

}