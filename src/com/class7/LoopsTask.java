package com.class7;

public class LoopsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int nums=1;
		
		while (nums<=100) {
			System.out.print(nums+" ");
			nums++;
		}
		
		System.out.println();
		System.out.println("________________________________________________________");
		
		while (nums>=1) {
			System.out.print(nums+" ");
			nums--;
		}
		
		System.out.println();
		System.out.println("___________Print EVEN numbers from 20 to 100____________");
		
		int nums2=20;
		
		while (nums2<=100) {
			System.out.print(nums2+" ");
			nums2=nums2+2;
		}
		
		//OR
		
		System.out.println();
		System.out.println("_____________________Same as above_______________________");
		
		int a =20;
		
		while (a<=100) {
			if (a%2==0) {
				System.out.print(a+" ");
			}a++;
		}
        
		
    	System.out.println("End of code.");
    	System.out.println("__________________________________________________________");
    	
    	
    	


	}

}
