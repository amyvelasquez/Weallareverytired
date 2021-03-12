package reviewClass1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Hello Batch 9 ");
		
		//byte, short, int, long - to store whole numbers
		//float & double - to store numbers with decimals
        //char - store single characters
		//boolean - store true or false
		//string - stores no primitive characters
		
		String number1="10";
		String number2="20";

		int numba1=10;
		int numba2=20;
		
		System.out.println(number1+number2);
		System.out.println(numba1+numba2);
		
		int num3=10;
		int num4=25;
		
		System.out.println(num3+num4);//=35
		System.out.println(num3-num4);//=-15
		System.out.println(num3*num4);//=250
		System.out.println(num3/num4);//=0 because its store as int and cant store decimal.. 10/25 actually = .4 
		System.out.println(num3%num4);//=10
		
		float num5=10f;
		float num6=25f;
	
		
		
		System.out.println(num5/num6);
		System.out.println(10.0/25.0);// when an equation is in ()... equation's solution will print
		
		String firstName="Amy";
		String surname="Velasquez";
		String mobile="123-456-7890";
		String password="123pass";
		String day="3";
		String month="Sept";
		String year="1997";
		char gender='F';
		
		float number=8.2f;
		
		System.out.println("the answer is "+(number*number));
		
	
		float myFloat = 8.2f;
		System.out.println("The multiplication of " + myFloat + " with itself is equal to " + (myFloat*myFloat));
		
				/*
				 * THE IF/ELSE vvvvvvv If money(which equals 1000) is>9000, 
				 * then eclipse will print "lets have a party" if not (or "else")
				 * then eclipse will print "no party"
				 */
		
		int money =1000;
		
	if (money>900) {
		System.out.println("Let's have a party");}
	else {
		System.out.println("No party let's oractice Java");
		
	}
	
	
		
	}

}
