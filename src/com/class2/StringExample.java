package com.class2;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		name="Amy";
		
		String greeting="Good morning!";
		String phoneNumber="240-351-3829";
				
		String stringNumber="12";
		
		String wordWithSpace=" ";
		
		// Hello my name is Amy
		
		System.out.println("Hello my name is "+name+".");
		
		//Attached variable to string by adding plus sign
		//** spaces inside quotations matter. spaces outside quotations dont.
		
		String example1="Amy Velasquez";
		
		//How are you Amy?
		
		System.out.println("How are you "+ name+"?");
		
		//anything inside quotations prints exactly as is in quotations. 
		
		int age=23;
				
		// I am 25 years old.
				
	   System.out.println("I am "+age+" years old.");
	   
	   //Amy is a great student.
	   
	   String adjective="great";
	   
	   System.out.println(name +" is a "+adjective+" student.");
	   
	   /* String concatenation operator "+" is used when
	    * we attach String to another String
	    * we attach String to a number
	    * we attach String to any character or boolean
	    */
		
		String car="Mercedes Benz";
		String year="2016";
		
		
		
		//I drive a 2016 Mercedes Benz.
		
		System.out.println("I drive a "+year+" "+car+".");
		
		String computer="Mac Book";
		int memory=256;
				
		//Amy has a Mac Book with 252 GB memory.
				
		System.out.println(name+" has a "+computer+" with "+memory+" GB memory.");
				
		String combinedValue=year+" "+car;// 2016 Mercedes Benz
		System.out.println(combinedValue);
		
		// February 7
		
		int day=7;
		String month="February ";
		
		// combine/attach int with string by using concatenation to create a new, bigger string. 
		
		String date=month+day;
		
	    System.out.println(date);
		
		
				
			
		
		
		
		
		
		
		
		
	}

}
