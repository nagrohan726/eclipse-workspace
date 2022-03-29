package com.rohan.java.re;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("\\s");
		String[] words = pattern.split("How are you?");

		for (String word : words) {
			System.out.println(word);
		}

		Pattern pattern2 = Pattern.compile("[.]");
		String[] words2 = pattern2.split("www.google.com");

		for (String word : words2) {
			System.out.println(word);
		}

		String s = "www.google.com";
		String[] words3 = s.split("[.]");
		for (String word : words3) {
			System.out.println(word);
		}
	}

}
