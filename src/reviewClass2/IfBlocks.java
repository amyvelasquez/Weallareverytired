package reviewClass2;

public class IfBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num1=10;
		
		
		//if number is divisible by 2, 5 and 10. 3 lines should print.
		// if it is only divisible by 5 and 10 only two lines should print.
		//if its divisible by 10 only one should print
		
//		if(num1%5==0) {
//			System.out.println("Number is divisble by 5");
//		}else {
//			if (num1%2==0) {
//				System.out.println("num is divisible by 2");
//			}else {
//				
//			}
//		}
		
	if (num1%5==0) {
		System.out.println("num is divisible by 5");
	}
	
	if(num1%2==0) {
		System.out.println("num is divisible by 2");
	}
	
	if(num1%10==0) {
		System.out.println("num is divisible by 10");
	}
	
	
	}

}
