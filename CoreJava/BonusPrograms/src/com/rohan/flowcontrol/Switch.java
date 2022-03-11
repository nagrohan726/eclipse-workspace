package com.rohan.flowcontrol;

public class Switch {

	public static void main(String[] args) {

		String choice = "Check Balance";

		switch (choice) {
		case "Check Balance":
			System.out.println("Check Balance");
			break;
		case "Change Pin":
			System.out.println("Change Pin");
			break;
		case "Withdraw Cash":
			System.out.println("Withdraw Cash");
			break;
		case "Deposit Cash":
			System.out.println("Deposit Cash");
			break;
		default:
			System.out.println("Time Out");
		}
	}

}
