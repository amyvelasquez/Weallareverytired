package com.class6;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		/*
		 * Idenitfy Fave Food
		 * Capture Country from User
		 * Based on Country, Identify Fave Food
		 */
		
		Scanner input=new Scanner(System.in);
		
		String country, food;
		
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch(country.toLowerCase()) {//.toLowerCase OR .toUpperCase will allow for your input to execute regardless of LOWER/UPPER CASE
		                               //.toLoweerCase means all variables must be entered in lower case
		                               //.toUpperCase means all variable must be entered in upper case
		case "usa":
			food="burgers";
			break;
		case "afghanistan":
			food="Kebab";
			break;
		case "vietnam":
			food="Pho";
			break;
		case "poland":
			food="Pierogi";
			break;
		case "kazakhstan":
			food="horse";
			break;
		case "belarus":
		    food="draniki";
		    break;
		case "tajikistan":
			food="plov";
			break;
		case "mexico":
			food="Tacos";
			break;
		default:
			food="Unknown";
		}
		
		System.out.println("Your fave food is "+food);
	}
	
}
