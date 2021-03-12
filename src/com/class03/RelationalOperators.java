package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=7;
		
		System.out.println(a>b);//is a greater than b? yes = true
		System.out.println(a<b);//is a less than b? no = false
		System.out.println(a==b);// is a equals to b?
		System.out.println(a!=b);//is a not equal to b?
		
		System.out.println("_______________________________________________");
		
		//just diff way to find same result as above
		
		boolean result=a>=b;//is a greater than b? yes
		boolean result1=a<=b;// is a less than b? no
		
		
		System.out.println(result);//true=yes
		System.out.println(result1);//false=no
		
		System.out.println("_______________________________________________");

		int c=20;
		int d=29;
		
		//operation occurs from left to right
		
		System.out.println(c==d);//checking equality
		System.out.println(c=d);// reassigning value of d to c
		System.out.println(c);// now c will equal 29
		System.out.println(d);// d never changed its still 29
		
		
	}

}
