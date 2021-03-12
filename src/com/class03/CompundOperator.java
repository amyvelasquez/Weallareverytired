package com.class03;

public class CompundOperator {

	public static void main(String [] args) {
		
		
	int num =100;
	
	num=num+100; // changed value of num to 200
	
	System.out.println(num);
	
	num=num-50;// changed from 200 to 150
	
	System.out.println(num);
	
	int num1=100;
	
	num1+=100;// SAME OUTPUT AS num1=num1+100; adds 100 to variable value = 200
	System.out.println(num1);//=200
	
	num1-=50;
	System.out.println(num1);//=150
	
	num1/=5; 
	System.out.println(num1);//=30
	
	num1*=10;
	System.out.println(num1);//=300
	
	num1+=20;
	System.out.println(num1);//=320
	
	int a=1;
	a+=10;//new value of a =11 SAME AS SAYING int a=a+10;
	System.out.println(a);
	
	int apple=19;
	apple+=500;
	
	System.out.println(apple);
	
	int orange=200;
	orange-=67;
	System.out.println(orange);//200-67=133
	
	double cakePiece=11;
	cakePiece/=4;
	System.out.println(cakePiece);//11/4=2.75
	
	double cake=25;
	cake/=7;
	System.out.println(cake);//25/7=3.5714285714285716
	
	cake%=7;//25%7=3.5714285714285716
	System.out.println(cake);
	
	
	
	}
}

