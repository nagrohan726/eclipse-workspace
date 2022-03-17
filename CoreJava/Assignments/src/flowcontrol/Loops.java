package flowcontrol;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		System.out.println("Select Loop type: ");
		System.out.println("1. For");
		System.out.println("2. While");
		System.out.println("3. Do-While\n");
		System.out.print("Enter your choice[1-3]: ");
		short choice = scan.nextShort();

		switch (choice) {
		case 1:
			For(num);
			break;
		case 2:
			While(num);
			break;
		case 3:
			DoWhile(num);
			break;
		default:
			System.out.println("Error! Please try again!");
		}

		scan.close();
	}

	static void For(int num) {

		for (int i = 1; i <= num; i++) {
			if (i == 100)
				break;
			if (i % 10 == 0)
				continue;
			System.out.println(i);
		}

	}

	static void While(int num) {

		int i = 0;
		while (i < num) {
			i++;
			if (i == 100)
				break;
			if (i % 10 == 0)
				continue;
			System.out.println(i);
		}

	}

	static void DoWhile(int num) {

		int i = 0;
		do {
			i++;
			if (i == 100)
				break;
			if (i % 10 == 0)
				continue;
			System.out.println(i);
		} while (i < num);

	}
}
