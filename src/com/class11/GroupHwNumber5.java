package com.class11;

import java.util.Scanner;

public class GroupHwNumber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5.
				System.out.println("Enter the value of x and y");  
			    Scanner sc = new Scanner(System.in);  
			    int x = sc.nextInt();  
			    int y = sc.nextInt();  
			    System.out.println("before swapping numbers: x = "+x +" and y = "+ y);  
			    x = x + y;  
			    y = x - y;  
			    x = x - y;  
			    System.out.println("After swapping: x = "+x +" and y = " + y);
	}

}
