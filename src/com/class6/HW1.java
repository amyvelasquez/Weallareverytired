package com.class6;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner answer=new Scanner(System.in);
		
		System.out.println("Please enter your country.");
		
		String country, language;
		
		country=answer.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "Philippines":
			language="Tagalog";
			break;
		case "China":
			language="Mandarin";
			break;
		case "France":
			language="French";
			break;
		case "Brazil":
			language="Portuguese";
			break;
		default:
			language="Unidentified";			
		}
		
		System.out.println("Your native language in "+country+" is "+language);
	}
}
