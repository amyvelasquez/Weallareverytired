package com.class7;

public class LoopOddHW {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int odd=1; odd<=50; odd++) {
			if (odd%2!=0) {
				sum+=odd;
			}
		} 
		
		System.out.println("The sum of all odd numbers from 1-50 is "+sum);
		
		int sum2=0;
		
		for(int even=50; even>1; even-=2) {
			if (even%2==0) {
				sum2+=even;
			}
		}
		
		System.out.println("The sum of all even numbers from 1-50 is "+sum2);
		
		int result=sum+sum2;
	
		System.out.println("The sum of ALL numbers from 1-50 is "+result );
		
		
		System.out.println();
		System.out.println("________________BETTER WAY TO DO SAME AS ABOVE_______________");
		System.out.println();
		
		int odd2, even2,result2;
		
		odd2=0;
		even2=0;
		
		for(int a=50; a>=1; a--) {
			if(a%2==0) {
				even2+=a;
			}else {
				odd2+=a;
			}
		}
		
		result2=even2+odd2;
		
		System.out.println("The sum of all even numbers from 1-50 is "+even2);
		System.out.println("The sum of all odd numbers from 1-50 is "+odd2);
		System.out.println("The sum of ALL numbers from 1-50 is "+result2);
	}
}
