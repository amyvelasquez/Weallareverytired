package com.class11;

import java.util.Scanner;

public class GroupHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		//2.
		int [][] dmv= {
				
				{23,50,84,67},
				{9,678,21,43},
				{85,32,17,65},
				
		}; 
		
		for (int a=0; a<dmv.length; a++) {
			for (int b=0; b<dmv[a].length; b++) {
				if (dmv[a][b]%2==0) {
					System.out.println(dmv[a][b]);
				}
			}
		}
	
	}

}
