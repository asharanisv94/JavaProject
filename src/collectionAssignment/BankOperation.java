package collectionAssignment;

public class BankOperation {
	
	public void validatePin(PersonalDetails personAcct, int enteredPin) {
		if(personAcct.getPinNumber()==enteredPin) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid PIN");
		}
	}

}
