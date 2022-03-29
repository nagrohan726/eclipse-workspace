package com.rohan.java.re;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

	public static void main(String[] args) {

		File directory = new File("C:\\D-drive\\Shared");
		String[] fileNames = directory.list();
		Pattern pattern = Pattern.compile("\\w+[.]txt");
		int count = 0;

		for (String fileName : fileNames) {
			Matcher matcher = pattern.matcher(fileName);
			if (matcher.matches()) {
				++count;
				System.out.println(fileName);
			}
//			if (Pattern.compile("\\w+[.]txt").matcher(fileName).matches())
//				System.out.println(fileName);
		}
		System.out.println("Number of Txt files is: " + count);

	}

}
