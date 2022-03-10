package bonusprograms;

public class BankAccount {

	static String bankName = "Bank of India"; // method area - static ( has default value / same value throughout the
												// class )
	String accountHoldersName; // heap area - non static ( has default value / value differs per object )
	String accountNumber;
	float balance;

	public static void main(String[] args) {
		double loanInterestRate = 7.5; // stack area - local variable ( no default value )
		System.out.println(loanInterestRate);

		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHoldersName = "Rohan";
		bankAccount.accountNumber = "123525346";
		bankAccount.balance = 20000f;
		System.out.println(bankAccount.balance);
	}

}
