package com.rohan.techgig.practice;

import java.util.Scanner;

public class RemoveExtraSpace {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

//		sentence = sentence.trim();
//
//		String[] words = sentence.split("[\\s]+");
//		sentence = "";
//		for (String word : words) {
////			System.out.println(word);
//			sentence = sentence + word + " ";
//		}
//
//		System.out.println(sentence);

		System.out.println(sentence.replaceAll("[\\s]+", " ").trim());

		scan.close();

	}

}
