package com.rohan.trainings.java;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

//		System.out.println("Enter Two Integers: ");
		out.println("Enter Two Integers: ");

		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
//		int num2 = Integer.parseInt(scan.next());
		int num2 = parseInt(scan.next());

		int result = num1 + num2;

		System.out.println("Sum is " + result);

		scan.close();
	}

}
