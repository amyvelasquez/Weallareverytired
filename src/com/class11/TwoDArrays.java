package com.class11;

public class TwoDArrays {

	public static void main(String[] args) {
		
		int [][] num=new int[3][4];
		
		// 1st array or 1st row
		
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		//2nd array
		
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		//3rd array
		
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		System.out.println(num[1][3]);//print 40
		System.out.println(num[2][2]);//300
		
		System.out.println("______Another way to create 2D Arrays (Shorter)______");
		System.out.println();
		
		int [][] numbers= {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300},
		};
		
		System.out.println(numbers[0][2]);// prints 3
		System.out.println(numbers[1][1]);// 20
		
		//What's the output?
		
		System.out.println(numbers[1][2]+numbers[0][3]);//34
		
		//System.out.println(numbers[0][4]); Out of bounds error 
		
		numbers[2][2]=500;
		
		System.out.println(numbers[2][2]);
		
		
	}
}
