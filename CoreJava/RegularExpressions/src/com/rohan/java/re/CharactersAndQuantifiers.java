package com.rohan.java.re;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "z"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[abc]+", "abc"));

		// + = 1 or more
		// * = 0 or more
		// - = 1
		// ? = 0 or 1

		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "a"));
		System.out.println(Pattern.matches("\\D", "a"));

		// \d = Digit
		// \D = Not digit

		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test")); // exactly 5
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test1"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test_")); // special character not mentioned
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "tes")); // bounds

	}

}
