package com.class6;

public class SwitchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * store Gender in M or F
		 * Based on Gender, specify -
		 *   if M --> Male
		 *   if F --> Female
		 *   otherwise --> unknown
		 */
		
		char gender='F';
		String desc;
		
		switch(gender) {
		
		case 'M':
			desc="Male";
			break;
		case 'F':
			desc="Female";
			break;
		default:
			desc="N/A";
			
		}	
			System.out.println(desc);
			
			System.out.println("____________________________");
		
			
			
	}

}
