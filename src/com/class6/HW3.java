package com.class6;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner (System.in);
		
		double num1, num2, result;
		char operator;
		
		System.out.println("Enter the first number in your equation.");
		
		num1=calc.nextDouble();
		
		System.out.println("Enter the operator for your equation.");
		
		operator=calc.next().charAt(0);
		
		System.out.println("Enter the second number in your equation.");
		
		num2=calc.nextDouble();
		
		switch(operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			result=0;
			System.out.println("Error - Please enter valid operator");
			}
		
		if (result!=0) {
		System.out.println(num1+ " "+operator+" "+num2+" = "+result);

		}   
		 
		}
		
	}	