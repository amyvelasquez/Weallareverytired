package com.class8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*
         * Write a program to ask a user to enter item they want to buy and the price of that item. 
         * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
         * If user give more money program should return a change. 
         * Whenever a user done with payments program should say "Thank you for shopping!"
         */

		
		Scanner purchase=new Scanner(System.in);
		
        System.out.println("Which item do you want to buy?");
        String item=purchase.nextLine();
        
        double price=15;
        System.out.println("Ok! The "+item+" costs "+price);
        
        double money, moreMoney;
        
        moreMoney=0;
        
        double change, stillDue;
       
        System.out.println("Your total is $15");	
        
       do {
    	   
            money=purchase.nextDouble();
            
            if (money>price) {
     		   change=money-price;
     		   System.out.println("I owe you "+change);
               break;
     	   }else if (money<price) {	
     		  stillDue=price-money;
			   System.out.println("You still owe me "+stillDue);
			   moreMoney=purchase.nextDouble();
			   money+=moreMoney;
			   if(money>price) {
				   change=money-price;
				   System.out.println("I owe you "+change);
     			break;
     			   }
     		  }else {
     			  break;
     		  }
        
       }while (moreMoney!=price);
    	   
     System.out.println("Thanks for your purchase");
       
     
     System.out.println();
     System.out.println("____________Same as above but Better____________");
     System.out.println();
     
     Scanner input = new Scanner(System.in);
     String item2;
     int price2;
     int money2;
     int remainder;
     int sum=0;
     
     System.out.println("Please enter an item you would like to buy");
     item=input.nextLine();
     
     System.out.println("Please enter the price of "+item);
     price2=input.nextInt();
     System.out.println("Please pay for "+item);
     
     do {
         money=input.nextInt();
         sum+=money;
         
         if (sum<price2) {
             
             remainder=price2-sum;
             
             System.out.println("Please give "+remainder);
             
         }else if (sum>price2){
             
             remainder=sum-price2;
             
             System.out.println("Here is your change "+remainder);
             
             break;
             
         }else {
             System.out.println("You got the right amount");
         }
         
     }while(price2!=sum);
     
     System.out.println("Thank you for shopping");

	}

}
