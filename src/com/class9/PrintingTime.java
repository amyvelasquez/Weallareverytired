package com.class9;

public class PrintingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println();
		System.out.println("_______________Printing Time_______________");
		System.out.println();
		
		for (int h=00; h<=23; h++) {
			for (int m=00; m<=59; m++)
				if(h<10 && m<10) {
					System.out.println("0"+h+":0"+m);
				}else if (h<10 && m>=10) {
			    	System.out.println("0"+h+":"+m);
			    }else if(h>=10 && m<10) {
			    	System.out.println(h+":0"+m);
			    }else {
			    	System.out.println(h+":"+m);
			    }
		}
		
		System.out.println();
		System.out.println("_______________Printing Time W Nested If_______________");
		System.out.println();
		
		for (int h=00; h<=23; h++) {
			for (int m=00; m<=59; m++) {
				if (h<10) {
		          if(m<10) {
		        	  System.out.println("0"+h+":0"+m);
		          }else { 
		        	  System.out.println("0"+h+":"+m); 
		          }
			    }else {
			    	if (m<10) {
			    		System.out.println(h+":0"+m);
			    	}else {
			    		System.out.println(h+":"+m);
			    	 }
			    		
			    	}
			    }
				
			}
	}

}
