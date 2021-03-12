package com.class2;

public class ArithmeticOperatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=5;
		
		// +, *, /, -, %
		
		System.out.println(num1*num2); //10*5
		System.out.println(num1+num2);//10+5
		System.out.println(num2/num1);//5/10
		System.out.println(num2-num1);//5-10
		
		int sum=num1+num2;//15=10+5
		
		System.out.println(sum);
		
		//sum of number 10 and 5 is 10
		
		System.out.println("sum of number "+num1+" and "+num2+" is "+sum);
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
	    double subOfDouble=number1-number2;
	    double multOfDouble=number1*number2;
	    double divOfDouble=number2/number1;
	  
				
				System.out.println(sumOfDouble);
				System.out.println("Result of division of 2 double values "+divOfDouble);
				
				float n1=10.99f;
				float n2=90.99f;
				
				float f=n2/n1;
				
				System.out.println("Result of division of 2 float values "+f);
				
				// double vs float - double just allows for more numbers to show after decimal. 
					
				
				
	}
	

}
