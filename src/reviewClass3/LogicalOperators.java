package reviewClass3;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner (System.in);
		
		System.out.println("{Please enter your password");
		String pw=scanner.nextLine();
		
		if (pw.equals("pass123")) {
			System.out.println("Enter amt you wanna xfer.");
			double xfer=scanner.nextDouble();
			if (xfer<1000) {
				System.out.println("Transfer complete");
			}else {
				System.out.println("NSF Balance.");
			}
		}else {
			System.out.println("You password is incorrect");
		
	}

}

}