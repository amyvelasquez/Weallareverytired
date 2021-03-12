package com.class5;

import java.util.Scanner;

public class TaskNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner score=new Scanner(System.in);
		
		double quiz, midTerm, finals, gpa;
		
		System.out.println("Please enter your quiz score.");
		
		quiz=score.nextDouble();
		
		System.out.println("Please enter your midterm score.");

		midTerm=score.nextDouble();
		
		System.out.println("Please enter your finals score.");

		finals=score.nextDouble();
		
		gpa=(quiz+midTerm+finals)/3;
		
		char grade;
	
		if (gpa>=90) {
			grade='A';	
		}else if (gpa>=70 && gpa<=90) {
			grade='B';
		}else if(gpa>=50 && gpa<70) {
			grade='C';
		}else if (gpa<50) {
			grade='F';
		}else {
			grade='D';
		}
		System.out.println("Your grade is "+grade);
	}
	}


