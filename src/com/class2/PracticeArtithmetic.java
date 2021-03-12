package com.class2;

public class PracticeArtithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float val1=22.5f;
		float val2=72.92f;
		
		float sumOfVal=val1+val2;
		float difOfVal=val2-val1;
		float multOfVal=val2*val1;
		float divOfVal=val2/val1;
		
		System.out.println("The sum of "+val1+" and "+val2+" is equal to "+sumOfVal);
		System.out.println("The division of "+val2+" and "+val1+" is equal to "+divOfVal);
		System.out.println("The difference between "+val2+" and "+val1+" is equal to "+difOfVal);
		System.out.println("The result of multiplication between "+val1+" and "+val2+" is equal to "+multOfVal);
		
		double val3=3.9;
		
	    double squareOfVal3=val3*val3;
	    
	    System.out.println("The square of "+val3+" is "+squareOfVal3);
	    		
	    int width=5;
	    int height=8;
	    
	    int area=width*height;
	    int perimeter=2*(width+height);
	    
	    System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to " +perimeter+" and the area is "+area);;
    		
	    //modulus operator --> shows remainder after division
	    
	    int mod=10%3;
	    System.out.println("remainder is "+mod);// 10/3=9 so 1 is the remainder
	    
	    int mod1=10%2;
	    System.out.println("remainder is "+mod1); //10/2 is 5 and there is nothing remaining so its 0
	    
	    int mod2=15%4;
	    System.out.println("remainder is "+mod2);//4 goes into 15 3 full times.. 4*3=12...area 15-12+3
	    
	    		int r=(20%7)*3;
	    System.out.println("remainder is "+r);
	    
	    		
	    
	    
	}

}
