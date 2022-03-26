package assertions;

public class AssertDemo {

	public static void main(String[] args) {

		int withdrawlAmount = 100;
		int currentBalance = 60;
//		int currentBalance = 160;

//		assert (withdrawlAmount < currentBalance);
		assert (withdrawlAmount < currentBalance) : "Withdrawl amount is more than current balance";
	}

}
