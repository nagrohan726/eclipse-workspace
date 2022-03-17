package flowcontrol;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {

		boolean isPrimeNumber = true;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				isPrimeNumber = false;
		}

		if (isPrimeNumber)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number");

		scan.close();
	}
}
