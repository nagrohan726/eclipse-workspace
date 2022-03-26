package scanner;

import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter Numbers to calculate sum");
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			sum += num;
		}
		System.out.println("Sum is: " + sum);
	}
}
