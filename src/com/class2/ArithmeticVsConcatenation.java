package com.class2;

public class ArithmeticVsConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2);// 21HelloHi
		
		System.out.println(num1+str1+num2+str2);//10Hello11Hi
		
		System.out.println(str1+str2+num1+num2);//HelloHi1011
		
		/* when you have a number and string... as soon as + sees string.. it works as concatenation for the rest of the string
		 *so instead of completing the addition equation, it attaches the string. 
		 *if the equation of numbers is first, it will complete the equation.
		 *between 2 or more numbers, the + will work as arithmetic operator only if equation came before rest of string.
		 *between a string, the + will act as concatenation operator.  
		 * UNLESS we put it in parentheses. Recall PEMDAS!! Anything in parentheses will be worked first
		 * EX:
		 */
			 
			System.out.println(str1+str2+(num1+num2)); 
		
		
		
	}

}
