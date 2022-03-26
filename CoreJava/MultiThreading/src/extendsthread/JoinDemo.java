package extendsthread;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		System.out.println("Sum of first 'N' numbers");
		System.out.print("Enter a value: ");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();

		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum);

		scanner.close();

		long end = System.currentTimeMillis();

		System.out.println("The total time taken is " + (end - start) / 1000 + " seconds");
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
