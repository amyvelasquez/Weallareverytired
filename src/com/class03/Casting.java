package com.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i =10.99; ERROR - TYPE MISMATCH
		
		/*TO CAST
		 * variable TYPE name=(newVariableType)value;
		 */
		
		//widening or implicit(automatic) casting
		double d=10;
		System.out.println(d);// = 10.0 prints my int value to double value
		
		//narrowing or explicit(manual) casting
		int i=(int)12.99;
		System.out.println(i); //converts to 12 - loss of data since int cannot have decimals
		
		byte b=(byte)130;
		System.out.println(b);// converts to -126 whatever java interpreted as
		
	    int number=12;
	    double result=number/5;
	    System.out.println(result);// gives you 2.0 BECAUSE first value "number" or 12 in the equation was int
		
	    //for that reason - just user double to get most precise result
	    
	    double number12=12;
	    number12/=5;
	    System.out.println(number12);//2.4 is the correct result to above equation because used double
	
	    double newNum=10;//converted an int value 10 to double value type
	    newNum=newNum/3;// divided 10.0 by 3
	    System.out.println(newNum);
	    
	    double num1=10+10.5;
	    System.out.println(num1);//=20.5
	    
	    int num2=10+(int)10.5;//we kept whole value int by adding (int) to convert 10.5 to int
	    System.out.println(num2);//=20 but we lost data and is not so precise
	    
	    
	    
	}
	

}
