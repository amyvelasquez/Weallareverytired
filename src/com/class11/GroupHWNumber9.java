package com.class11;

public class GroupHWNumber9 {

	public static void main(String[] args) {
		
		int l, sl;
		l=0;
		sl=0;
		
		int[] array= {123,393,-900, 6789,7000,7000,3794,2956,2,313};
		
		
		for(int i=0; i<array.length; i++) {
			
				if(array[i]> l) {
					sl=l;
					l=array[i];
				
				}else if (array[i]>sl && array[i]!=l) {
					sl=array[i];
				}
		}
		System.out.println("The second largest number is "+sl);

		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
	}
}
