package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		num=20;
		System.out.println(num);
	
		int[] array=new int[5];
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[0]+array[4]);//10+13=23 so 23 will print
		
		double[] numbers=new double[2];
		
		numbers[0]=10;
		numbers[1]=19.01;
		
		numbers[0]=11.99;
		
		System.out.println(numbers[0]);
		
		String[] names=new String[3];
		
		names[0]="Jahanzeb";
		names[1]="Ozoda";
		//names[2]="Alex";If i try to print names[2], null will print because i didn't assign 
		
		System.out.println(names[2]);
		
		int []nums=new int[3];
		System.out.println(nums[1]);//this prints 0 because we didn't store a value - compiler adds default value
		
		boolean[] val=new boolean[3];
		
		val[0]=true;
		val[1]=false;
		val[2]=true;
		
		System.out.println(val[1]);
		
		int size=val.length;//how to determine size/property of array
		System.out.println(size);
		
		
		
		
		
	}
}
