package reviewClass2;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
        System.out.println("Please enter your username.");
		String name=scan.nextLine();
		
		System.out.println("Please enter your password.");
		String password=scan.nextLine();
			
		boolean Approved=true;
		double acctBalance=1000;
		
	if (name.equals("Amy")) {
		if(password.equals("Amy123")) {
			System.out.println("How much would you like to transfer?");
			double xfer=scan.nextDouble();
			if(acctBalance>=xfer) {
				System.out.println("Transfer complete.");
				
				}else {
					System.out.println("Insufficient funds.");
				}
			
		}else {
			System.out.println("Incorrect password.");
		}
		
	}else {
		System.out.println("Incorrect username.");
	}
		
	
	
	}

}
