package reviewClass2;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Amy";
		String password="Amy123";
		boolean Approved=true;
		double acctBalance=1000;
		double xfer=3000;
		
	if (name.equals("Amy")) {
		if(password.equals("Amy123")) {
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
